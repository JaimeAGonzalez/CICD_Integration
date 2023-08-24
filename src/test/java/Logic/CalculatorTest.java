package Logic;

import functionalities.Calculator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CalculatorTest{

    @Test(priority = 1)
    public void sumTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(3.0, calculator.sum(1.0, 2.0));
        Reporter.log("Functional test initialized...");
    }

    @Test(priority = 2)
    public void sumDifferentSignNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(1.0, calculator.sum(-1.0, 2.0));
        System.out.println("Add functionality is working...");
    }

    @Test(priority = 1)
    public void subTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(-1.0, calculator.sum(1.0, 2.0));
    }

    @Test(priority = 4)
    public void subDifferentSignNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(-3.0, calculator.sum(-1.0, 2.0));
        System.out.println("Sub functionality is working...");
    }

    @Test(priority = 5)
    public void multiplyNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(6.0, calculator.multiplication(2.0, 3.0));
        System.out.println("Multiply functionality is working...");
    }

    @Test(priority = 6)
    public void divideNumbers(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(2.0, calculator.division(4.0, 2.0));
    }

    @Test(priority = 6)
    public void divideNumbersIndefinition(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.division(4.0, 0.0));
        System.out.println("Div functionality is working...");
        Reporter.log("Functional test finished...");

    }

}
