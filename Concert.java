
/**
 * Décrivez votre classe Concert ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Concert
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
 
    private Pinkfloyd[] membre;
    private int i;
    /**
     * Constructeur d'objets de classe Concert
     */
    public Concert()
    {
        this.i = 0;
       this.membre = new Pinkfloyd[5];
    }
    
    public void addMember(Pinkfloyd membre){
        this.membre[i] = membre;
        this.i ++;
    }
    
    public int getAverageAge(){
        return (membre[0].getAge() + membre[1].getAge())/2;
    }
        

    /*
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }*/
}
