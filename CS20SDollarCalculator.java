/*******************************
 * Name: R Sveinson
 * Class: CS20S
 * 
 * Assignment: Dollar calculator
 * 
 * Description: calculate the number of dollars give 
 *              quarters and dimes
 *********************************/
// *** import libraries ***
import java.util.Scanner;

public class CS20SDollarCalculator
{
    public static void main(String[] args){
    // *** constants ***
    
        final double QVALUE = 0.25;     // dollar value of a quarter
        final double DVALUE = 0.1;      // dollar value of a dime
    
    // *** variables ***
    
        String banner = "";     // output banner
        String strin = "";      // input string
        String strout = "";     // output string
        
        // calculation variables
        double quarters = 0.0;      // number of quarters
        double dimes = 0.0;         // number of dimes
        
        double dollars = 0.0;       // number of dollars
    
    // *** objects ***
    
        // to get input from the keyboard
        Scanner scanner = new Scanner(System.in);
    
    // *** banner ***
    
        banner = "*************************\n";
        banner += "Name: R Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Dollar calculator\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** input ***
    
        // prompt user for information
        // get quarters
        System.out.println("Enter the number of quarters.");
        quarters = scanner.nextDouble();
        System.out.println("you have " + quarters + " quarters.");
        
        // get dimes
        System.out.println("Enter the number of dimes.");
        dimes = scanner.nextDouble();
        System.out.println("you have " + dimes + " dimes.");

    
    // *** processing ***
    
        // get dollars from quarters
        dollars = quarters * QVALUE;
        //System.out.println(dollars);
        
        // add dollars from dimes
        dollars += dimes * DVALUE;
        //System.out.println(dollars);
        
    // *** output ***
    
        System.out.print(quarters + " Quarters " + " + " + dimes + " Dimes ");
        System.out.println(" = $" + dollars);
    
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
