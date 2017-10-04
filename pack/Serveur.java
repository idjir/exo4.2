package pack;
import java.util.ArrayList;
import java.util.Iterator;

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
       Client tmp;
       
       Iterator lste= cl.iterator();
        while(lste.hasNext()) {
            tmp=(Client) lste.next();
            tmp.recevoir(message);
        }
    }
}
