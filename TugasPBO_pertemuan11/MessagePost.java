import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        // initialise instance variables
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void like()
    {
        // put your code here
        likes++;
    }
    
    public void unlike(){
        if(likes > 0) {
            likes--;
        }
    }
    
    public void addComment(String text){
        comments.add(text);
    }
    
    public String getText(){
        return message;
    }
    
    public long getTimeStamp(){
        return timestamp;
    }
    
    public void display(){
        System.out.println(username);
        System.out.println(message);
        System.out.print(timeString(timestamp));
        if(likes > 0){
            System.out.println(" - " + likes + " people like this.");
        }
        else{
            System.out.println();
        }
        if(comments.isEmpty()){
            System.out.println(" No comment.");
        }
        else{
            System.out.println(" " + comments.size() + " comment(s). Click here to view.");
        }
    }
    
    private String timeString(long time){
        long current = System.currentTimeMillis();
        long pastMillis = current - time;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else{
            return seconds + " seconds age";
        }
    }
}

