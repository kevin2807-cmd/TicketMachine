import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        // initialise instance variables
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addMessagePost(MessagePost message){
        messages.add(message);
    }
    
    public void addPhotoPost(PhotoPost photo){
        photos.add(photo);
    }
    
    public void show(){
        for(MessagePost message : messages){
            message.display();
            System.out.println();
            delay(2000);
        }
        
        for(PhotoPost photo : photos) {
            photo.display();
            System.out.println();
            delay(2000);
        }
    }
    
    private void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();
        
        MessagePost message1 = new MessagePost("Kevin Leonard", "Hallo semua");
        message1.like();
        message1.addComment("Hallo juga kevin");
        
        newsFeed.addMessagePost(message1);
        message1.addComment("Selamat pagi");
        
        
        PhotoPost photo1 = new PhotoPost("Vinard", "image1.jpg", "Ini adalah poto saya waktu liburan");
        photo1.like();
        photo1.addComment("Wah poto yang indah");
        
        newsFeed.addPhotoPost(photo1);
        newsFeed.show();

    }
}
