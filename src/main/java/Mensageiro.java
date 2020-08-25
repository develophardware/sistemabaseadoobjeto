import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by dirceu on 8/12/14.
 */
public class Mensageiro extends UnicastRemoteObject implements MensageiroCon {

    public Mensageiro() throws RemoteException {
        //Gera os stubs dinamicos, substitui o uso do rmic
        super();
    }

    public void enviarMensagem( String msg ) throws RemoteException {
        System.out.println( msg );
    }

    public String lerMensagem() throws RemoteException {
        return "This is not a Hello World! message";
    }
}