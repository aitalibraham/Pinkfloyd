
/**
 * Compositon du groupe Pink floyd.
 *
 * @AIT ALI BRAHAM & BERGUIG
 * @v1
 */
public class Pinkfloyd
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
 
    private String role;
    
    
    private int age;

    /**
     * Constructeur d'objets de classe Pinkfloyd
     */
    public Pinkfloyd()
    {
        // initialisation des variables d'instance
        role = "Guitariste";
        name = "David Gilmur";
        age = 74;
  
        
    }
    
    public Pinkfloyd(String name, String role, int age) {
        this.role = role;
        this.name = name;
        this.age = age;
    }
    
   

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getRole()
    {
        // Insérez votre code ici
        return this.role;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name= name;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void addYear(){
        this.age ++;
    }
    
}


