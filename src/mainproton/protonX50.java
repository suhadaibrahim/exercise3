package mainproton;
public class protonX50 extends protonX70 {

    String park;
    String colour;
    String chooseColour;
    
    protonX50(){
        this.park = "Auto park";
        this.colour = "black";
        this.chooseColour = "silver & white";
    }
    
    public void parking(){
        System.out.println("Auto parking asists " + park);
    }
    public static double sum(double x, double y, double z) {
        return x + y + z;
    }
    
    void colour(){
        System.out.println("Colour of this car : " +colour);
    }
    
    void chooseColour(){
        System.out.println("Another choice is " + chooseColour);
    }
    
    
    @Override
    void run(){
        System.out.println("Proton X50 is running safety");
    }


}
