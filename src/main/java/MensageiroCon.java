import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * Created by dirceu on 8/17/14.
 */
public interface MensageiroCon extends Remote, Serializable {

    public void enviarMensagem( String msg ) throws RemoteException;
    public String lerMensagem() throws RemoteException;
}
