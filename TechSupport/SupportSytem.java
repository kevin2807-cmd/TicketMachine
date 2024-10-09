public class SupportSystem
{
    // instance variables - replace the example below with your own
    private Input_reader reader;
    private Responder responder;

    public SupportSystem()
    {
        // initialise instance variables
        reader = new Input_reader();
        responder = new Responder();
    }

    public void start()
    {
        // put your code here
        boolean finished = false;
        
        printWelcome();
        
        while(!finished){
            String input = reader.getInput();
            
            if(input.toLowerCase().startsWith("bye")){
                finished = true;
            }
            else {
                String response = responder.generateResponse(input.toLowerCase());
                System.out.println(response);
            }
        }
        printGoodbye();
    }
    
    private void printWelcome(){
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }
    
    private void printGoodbye(){
        System.out.println("Nice talking to you. Bye...");
    }
}
