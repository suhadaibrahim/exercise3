package mainproton;
public class protonPersona extends proton{
    String boot;
    String run;
    
    protonPersona(){
        this.boot = "spaces";
    }
    
    public void boot(){
        System.out.println("This car got big boot " + boot);
    }
    
    void run(){
        System.out.println("Proton persona is running safety");
    }
    
}
