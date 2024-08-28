import java.io.BufferedReader;
import java.io.FileReader;
import src.Message.*;

public class HelloWorld {

   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.

      // Read in NewOrder example txt file
      try {
         BufferedReader reader = new BufferedReader(new FileReader("examples/NewOrder.txt"));
         String example = reader.readLine();
         System.out.println("Hello, World");
         System.out.println("\n");
         System.out.println(example);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}