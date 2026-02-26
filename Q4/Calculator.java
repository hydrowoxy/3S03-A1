/** 
 * 
 * I have again again commented out this class because 
 * I do not want to see my screen light up red with an exorbitant amount of 
 * red squiggly error lines
 * 

// This is the implementation from part b)

public class Calculator {

    public double divide(double a, double b){
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
        
}

// This is the implementation from part e)

public class Calculator {

    public double divide(double a, double b) {
        if (Math.abs(b) < 1e-12) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}

*/
