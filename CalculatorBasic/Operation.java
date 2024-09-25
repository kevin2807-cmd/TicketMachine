public class Operation
{
    // instance variables - replace the example below with your own
    public double Add(double num1, double num2)
    {
        // initialise instance variables
        return num1 + num2;
    }

    public double Subs(double num1, double num2)
    {
        // put your code here
        return num1 - num2;
    }
    
    public double Multiply(double num1, double num2)
    {
        return num1 * num2;
    }
    
    public double Divide(double num1, double num2)
    {
        if(num2 == 0){
            System.out.println("Cannot division number by zero");
        }
        
        return num1/num2;
    }
}
