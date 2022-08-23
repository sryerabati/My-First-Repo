
/**
 * Shreyas Yerabati
 * 8/23/22
 * Chapter 1 Notes
 * Class notes on basic concepts
 * Who helped me: Mr Hayes, Mr. Dog
 *
 */
public class Ch1Notes
{
    
    
    /*
     * This is our code notes 
     */
    public static void main(String[] args)
    {
    //basic data types
    double number = 8.9,number2;
    int x = 9,y,z;
    boolean choice = false;
    char  letter = 'b'; // HAVE TO USE SINGLE QUOTES FOR CHAR, only one character allowed
    float number3 = 8; // Holds less numbers than double, older type
    long n2 = 3; //Integer but can take 8 bytes
    short n3 = 7; //Shorter version of long that takes less memory
    
    
    
    // These are Classes and Objects instantiated from those Classes
    //Class    ID         memory       Constructor
    //Name
    Integer    n1 =        new         Integer(47);
    String     word =      new         String("Shreyas Yerabati");
    Double     number4 =  new         Double(6.7);
    
    System.out.print(word.length());
    }
}
