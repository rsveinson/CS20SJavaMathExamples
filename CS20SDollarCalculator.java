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
    
    // *** output ***
    
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
