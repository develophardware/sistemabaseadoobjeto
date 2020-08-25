import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by dirceu on 8/17/14.
 */
public class ServidorMensageiro {

    public ServidorMensageiro() {
        try {
            Mensageiro m = new Mensageiro();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ServicoMensageiro", m);
        }
        catch( Exception e ) {
            System.out.println( "Trouble: " + e );
        }
    }

    public static void main(String[] args) {
        new ServidorMensageiro();
    }
}