import java.util.*;

public class Calculator
{
    public static void runCalculator()
    {
        Operation calculator = new Operation();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation");
        System.out.println("1 for 'Add' Operation");
        System.out.println("2 for 'Substarction' Operation");
        System.out.println("3 for 'Multiply' Operation");
        System.out.println("4 for 'Divide' Operation");
        
        int operation = sc.nextInt();
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        
        double result;
        
        switch(operation)
        {   
            case 1:
                result = calculator.Add(a,b);
                System.out.println("The Result is = " + result);
                break;
            
            case 2:
                result = calculator.Subs(a,b);
                System.out.println("The Result is = " + result);
                break;
                
            case 3:
                result = calculator.Multiply(a,b);
                System.out.println("The Result is = " + result);
                break;
            
            case 4:
                result = calculator.Divide
                (a,b);
                System.out.println("The Result is = " + result);
                break;
                
            default:
                System.out.println("Invalid operator!");
                return;
        }
    }
}
