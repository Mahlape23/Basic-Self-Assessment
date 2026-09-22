
package q01_powerandsquareroot.java;

public class Q01_PowerAndSquareRootJava {

   
    public static void main(String[] args) {
        // Values
        double base=2;
        double exponent=10;
        double number=81;
        
       //Usinhg the math operations
       double results=Math.pow(base,exponent);
        double SquareRootresults=Math.sqrt(number);
        //Displaying Values
       System.out.println(base + "^"+exponent+ "= "+results);
         System.out.println("Squareroot of "+number+" = "+SquareRootresults);
    }
    
}
