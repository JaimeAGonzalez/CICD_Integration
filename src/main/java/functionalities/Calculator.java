package functionalities;

public class Calculator {
    // Methods
    public double sum(double a, double b){
        return a + b; // Sum
    }
    public double subtraction(double a, double b){
        return a - b; // Subs
    }
    public double multiplication(double a, double b){
        return a * b; // multi
    }
    public double division(double a, double b){
        try{
            return a / b; // Div
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0; //Flag
        }
    }
    public double pow( double a, int b){
        return Math.pow(a, b); // Elevation
    }
}
