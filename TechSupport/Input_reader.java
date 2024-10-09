import java.util.HashSet;
import java.util.Scanner;

public class Input_reader
{
    // instance variables - replace the example below with your own
    private Scanner reader;

    public Input_reader()
    {
        // initialise instance variables
        reader = new Scanner(System.in);
    }
  
    public String getInput()
    {
        // put your code here
        System.out.print(">");   //Print prompt
        String inputLine = reader.nextLine();
        
        return inputLine;
    }
}
