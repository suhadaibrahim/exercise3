package mainproton;
public class protonSaga extends proton {
    String fuel;
    String sum;
    String run;
    double a,b;
    
    protonSaga(){
        this.fuel = "Diesel";
    }
    
    public void fuel(){
        System.out.println(" This car use fuel " + fuel);
    }
    
    public static double sum(double a, double b) {
        return a + b;
    }
   
    public static void main(String [] args){
        System.out.println(sum (30000,45000));
    }
    
    void run(){
        System.out.println("Proton saga is running safety");
    }

  
   
  
}
