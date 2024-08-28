import java.io.BufferedReader;
import java.io.FileReader;

import src.message.*;

public class HelloWorld {

   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.

      IMessage newOrder = new NewOrder("8=FIX.4.49=14835=D34=108049=TESTBUY152=20180920-18:14:19.50856=TESTSELL111=63673064027889863415=USD21=238=700040=154=155=MSFT60=20180920-18:14:19.49210=092");

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