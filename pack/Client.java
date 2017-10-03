package pack;
public class Client
{
    private Serveur serveur;
    private String name;
   
    public Client(String name)
    {
        this.name = name;
        this.serveur = null;
    }

    public boolean seConnecter(Serveur serveur)
    {
        boolean reponse = serveur.connecter(this);
        
        if(reponse == false) {return false;}
            
        else 
        {
            this.serveur = serveur;
            return true; 
        }
    }
    
    public void envoyer(String message)
    {
            serveur.diffuser(name + ": " + message);
    }
    
    public String recevoir(String message)
    {
        return message;
    }
}