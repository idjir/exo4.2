import java.util.ArrayList;
package pack;

public class Serveur
{
    private ArrayList<Client> cl;
    
    public Serveur()
    {
        cl = new ArrayList<Client>();
    }

    public boolean connecter(Client cll)
    {
        if(cl==null) {
            return false;
        }
        else {
            return cl.add(cll);
        }
    }
    
    public void diffuser(String message)
    {
       
        while(cl!=null) {
            cl.recevoir(message);
            cl.next();
        }
    }
}