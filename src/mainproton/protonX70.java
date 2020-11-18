package mainproton;
public class protonX70 extends protonPersona{
    String drive;
    
    protonX70(){
        this.drive = "maps";
    }
    
    public void drive(){
        System.out.println("This car easy to drive with " + drive);
    }
    
    @Override
    void run(){
        System.out.println("Proton X70 is running safety");
    }
    
}
