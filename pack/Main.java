package pack;


/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    
    
    public Main()
    {
       Serveur s= new Serveur();
       Client c= new Client("idir");
       
        c.seConnecter(s);
        c.envoyer("message");
    }
}
