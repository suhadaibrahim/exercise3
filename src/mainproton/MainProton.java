package mainproton;

import static mainproton.protonSaga.sum;
import static mainproton.protonX50.sum;

public class MainProton {

    public static void main(String[] args) {
        protonSaga s = new protonSaga();
        System.out.println("Proton saga features : ");
        s.fuel();
        System.out.println("RM "+ sum (30000,45000));
        s.run();
        
        protonPersona p = new protonPersona();
        System.out.println("\n Proton persona features : ");
        p.boot();
        p.printProton();
        p.run();
        
        protonX70 p1 = new protonX70();
        System.out.println("\n Proton X70 features : ");
        p1.drive();
        p1.run();
        
        protonX50 p2 = new protonX50();
        System.out.println("\n Proton X50 features : ");
        p2.parking();
        p2.run();
        p2.colour();
        p2.chooseColour();
        System.out.println("RM " + sum (79000,85000,103000));
        
         }
        
    
    }
    

