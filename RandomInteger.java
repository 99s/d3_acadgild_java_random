import java.util.Random;
import java.util.Scanner;

/** Generate 10 random integers in the range 0..N. */
public final class RandomInteger {
  
  public static final void main(String... aArgs){
  System.out.println("Enter A number : ");
        Scanner c = new Scanner(System.in);
        int N = inputN.nextInt();
    log("Generating 10 random integers in range 0..N.");
    
    //note a single Random object is used here
    Random randomGenerator = new Random();
    for (int idx = 1; idx <= 10; ++idx){
      int randomInt = randomGenerator.nextInt(N);
      log("Generated : " + randomInt);
    }
    
    log("Done.");
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
}