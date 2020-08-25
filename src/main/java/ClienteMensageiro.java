import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by dirceu on 8/17/14.
 */
public class ClienteMensageiro{

    public static void main( String args[] ) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            MensageiroCon m = (MensageiroCon) registry.lookup("ServicoMensageiro" );
            System.out.println( m.lerMensagem() );
            m.enviarMensagem( "Hello World!" );
        }

        catch( RemoteException e ) {
            System.out.println();
            System.out.println( "RemoteException: " + e.toString() );
        }
        catch( NotBoundException e ) {
            System.out.println();
            System.out.println( "NotBoundException: " + e.toString() );
        }
        catch( Exception e ) {
            System.out.println();
            System.out.println( "Exception: " + e.toString() );
        }
    }
}