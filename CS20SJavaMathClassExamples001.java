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
        banner += "Assignment: Java Class Library Examples\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** Math examples ***
    
        // the .pow() method
        System.out.println(nl + "************ .pow *****************");
        double power = 0.0;     // the result of an exponent
        int base = 0;           // the base of the exponent
        int exponent = 0;       // the exponent
        
        base = 2;
        exponent = 3;
        /* the pow function is used to
         * raise one number to some power
         * the first argument is the base, the 
         * second is the exponent
         * the result is a double
         */
        
        power = Math.pow(base, exponent);
        // //System.out.println(Math.pow(4, exponent));
        
        // /* using format codes
         // * % means that the follwing is a format code
         // * the number specifies the width of the field in character
         // * d code means it will print an int
         // * f code means it will print a double
         // * %6.2f means that there will be 2 decimal places
         // * s code means string and nl prints the new line character
         // */
        
        System.out.format("%4d^%1d = %6.2f %s", base, exponent, power, nl); 
        System.out.format("print the %% sign");
        
        // here's another way to apply .format
        //System.out.println(base + "^" + exponent + " = " + String.format("%6.2F",power) + nl);
        
        // System.out.println(nl + nl + "************ .max and .min *****************");
        
        // int n1 = 12;
        // int n2 = 8;
        
        // int big = 0;
        // int small = 0;
        
        // /* Math.max() will compare the two arguments
         // * and return the larger of the two
         // * Math.min() compares the two arguments
         // * and returns the smaller of the two
         // */
        // big = Math.max(n1, n2);
        // small = Math.min(n1, n2);
        
        // System.out.println("Biggest: "  + big);
        // System.out.println("Smallest: "  + small);
        
        System.out.println(nl + nl + "************ .sqrt *****************");
        double squareRoot = 0.0;
        int number = 25;
        
        squareRoot = Math.sqrt(number);
        System.out.format("Square root of %3d = %6.3f%s",number, squareRoot, nl);
        
        squareRoot = Math.sqrt(number + 3);
        System.out.format("Square root of %3d = %6.3f%s",(number + 3), squareRoot, nl);
        
    
    // *** output ***
    
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
