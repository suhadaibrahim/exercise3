package mainproton;
public class proton {
    String brand,windows,headlight;
    int tyreSize;
    
    proton(){
        this.brand = "Dunlop";
        this.tyreSize = 18;
    }
    
    proton(String w, String h){
        this.windows = w;
        this.headlight = h;
    }
    
    public void printProton(){
        proton obj1 = new proton();
        proton obj2 = new proton(" Up ", "On");
        proton obj3 = new proton ("Down", "Off");
        
        System.out.println("Tyre Brand : " + obj1.brand + "\nTyre size : " + obj1.tyreSize);
        System.out.println("Window : " + obj2.windows + "\nheadlight : " + obj2.headlight);
        System.out.println("Window : " + obj3.headlight + "\nheadlight : " + obj3.headlight);
    }
    
}
