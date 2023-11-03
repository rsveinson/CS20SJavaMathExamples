/*******************************
 * Name: R Sveinson
 * Class: CS20S
 * 
 * Assignment: Java Class Math Library Examples
 * 
 * Description: here are some examples of the Java Class
 *              Library called Math and some of the 
 *              methods/functions available
 *              
 *              There are lots of methods available, we'll only be
 *              looking at a few. You can see the whole list here
 *              https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 *              
 *              For this example we will not be using the template
 *              modular structure
 *********************************/
// *** import libraries ***
import java.util.Scanner;

public class CS20SJavaMathClassExamples001
{
    public static void main(String[] args){
    // *** constants ***
    
        final String nl = System.lineSeparator();
    
    // *** variables ***
    
        String banner = "";     // output banner
        String strin = "";      // input string
        String strout = "";     // output string
    
    // *** objects ***
    
        // to get input from the keyboard
        //Scanner scanner = new Scanner(System.in);
    
    // *** banner ***
    
        banner = "*************************\n";
        banner += "Name: R Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: AxQy\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** Math examples ***
    
        // the .pow() method
        // System.out.println(nl + "************ .pow *****************");
        // double power = 0.0;     // the result of an exponent
        // int base = 0;           // the base of the exponent
        // int exponent = 0;       // the exponent
        
        // base = 2;
        // exponent = 3;
        
        // power = Math.pow(base, exponent);
        // System.out.format("%4d^%1d = %6.2f %s", base, exponent, power, nl);    
        
        // System.out.println(nl + nl + "************ .max and .min *****************");
        
        // int n1 = 12;
        // int n2 = 8;
        
        // int big = 0;
        // int small = 0;
        
        // big = Math.max(n1, n2);
        // small = Math.min(n1, n2);
        
        // System.out.println("Biggest: "  + big);
        // System.out.println("Smallest: "  + small);
        
        // System.out.println(nl + nl + "************ .sqrt *****************");
        // double squareRoot = 0.0;
        // int number = 25;
        
        // squareRoot = Math.sqrt(number);
        // System.out.format("Square root of %3d = %3.3f%s",number, squareRoot, nl);
        
        // squareRoot = Math.sqrt(number + 3);
        // System.out.format("Square root of %3d = %3.3f%s",number, squareRoot, nl);
        
    
    // *** output ***
    
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
