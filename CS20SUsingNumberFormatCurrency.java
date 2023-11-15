import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  NumberFormatCurrence example
 **********************************************/
public class CS20SUsingNumberFormatCurrency{
    public static void main(String[] args){
        // **** Constants ****

        final String nl = System.lineSeparator();

        // **** variables ****

        String banner = "";         // output banner
        String prompt = "";         // prompt for input

        String strin = "";          // intput
        String strout = "";         // used for formatted output

        // **** Objects ****
        // create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // **** banner ****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  NumberFormatCurrence example" + nl;
        banner += "******************************";

        // now print the banner to the terminal window
        System.out.println(banner);

        // **** input ****

        // **** processing ****
        /* here are some examples of .format() and its
         * codes. Also included is an example of using
         * the NumberFormat currency instance to display
         * ouput as currence
         */

        //variables for this example
        int number = 23;
        double fNumber = 12.3456778;
        double dollarValue = 1152.98;
        String st = "hello world";

        // **** output ****

        // here's some output using .format()
        System.out.format("Number: %5d Floating point number: %10.3f%s", number, fNumber, nl);
        System.out.format("%20s%s", st, nl);
        System.out.format("%-20s%s", st, nl);       // what does the - do?
        
        /* now using the currency formatter
         * to display output with a $ and 3 decimal places
         * Note that the use of currency.format() changes the double into
         * a string so you have to use the correct code i.e. %s
         */
        System.out.format("Now to print as currency: %12s%s",currency.format(dollarValue), nl);

        System.out.println("text " + 5 + " 5 + 3 = " + 5 + 3);
        System.out.println(5 + 3 + "text " + 5 + " 5 + 3 = ");
        // **** closing message ****

        System.out.println();
        System.out.println("end of program");

    }// end main

}// end class
