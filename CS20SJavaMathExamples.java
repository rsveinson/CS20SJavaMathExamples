/*******************************
 * Name: R Sveinson
 * Class: CS20S
 * 
 * Assignment: Java Math Examples
 * 
 * Description: some simple examples of doing math in 
 *              Java
 *********************************/
// *** import libraries ***
import java.util.Scanner;

public class CS20SJavaMathExamples
{
    public static void main(String[] args){
    // *** constants ***
    
    // *** variables ***
    
        String banner = "";     // output banner
        String strin = "";      // input string
        String strout = "";     // output string
        
        // ints for integer math
        int currentYear = 2023;     // this year
        int birthYear = 0;          // the year of birth
        int age = 0;                // person's age
    
    // *** objects ***
    
        // to get input from the keyboard
        Scanner scanner = new Scanner(System.in);
    
    // *** banner ***
    
        banner = "*************************\n";
        banner += "Name: R Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Java Math Examples\n";
        banner += "*************************\n";
        
        System.out.println(banner);
    
    // *** input ***
    
        // prompt user for information
        System.out.println("enter you age in years.");
        
        // read in data from the keyboard buffer
        age = scanner.nextInt();
        
        // echo input back to the terminal window
        System.out.println("you are " + age + " years old.");
    
    // *** processing ***
    
        birthYear = currentYear - age;      // calculate the current year
        //System.out.println(birthYear);
    
    // *** output ***
        
        System.out.println("\n");
        System.out.println("Current Year \t Age \t Birth Year");
        System.out.println(currentYear + " \t\t " + age + " \t " + birthYear);
        
    // *** closing message ***
    
        System.out.println();
        System.out.println("end of program");
        
    } // end main
} // end class
