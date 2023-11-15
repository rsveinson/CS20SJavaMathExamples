/********************************************************
 * Name:       sveinson
 * Class:      CS20S - 01
 * 
 * Assignment:  Formatting output example
 * 
 * Description: a small program to demonstrate some of the output
 *              formatting options available in java
 ***********************************************************************/

// import statement go here
import javax.swing.JOptionPane;

public class FormattingOutputDemo {
    public static void main(String[] args) {
    // ***** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
    // declare some variables of different types
    
        String nl = System.lineSeparator(); // universal new line character
        String banner = "";                    // string banner for output
        String strout = "";                     // output string
        
        int number1 = 10;       // first integer
        int number2 = 154;     // second integer
        
        double floatingPoint = 5.4356743;       // a floating point number
        
        String st = "hello Clevland!";          // a string
    
    // ***** Create Objects *****
    
    // ***** Output Banners *****
    
        banner = ("*****************************" + nl);
        banner += ("Name: Sveinson" + nl);
        banner += ("Assignment: Formatting Ouput Example" + nl);
        banner += ("*****************************" + nl + nl);
        
        System.out.println(banner);
    
    // ***** get input *****
        
        // no input
        
    // ***** processing *****
    
        // no processing
    
    // ***** output *****
    
        // demonstrate the use of formatting strings and codes
        // a link will be posted to a page with more detailed information
        // about these formatting features
        
        System.out.format("%20s %5d you can put text in here as well %07d\n\n", st, number1, number2);
        System.out.format("%-20s minus sign left aligns %10.6f\n\n", st, floatingPoint);
        
        // and example of creating table like output
        
        System.out.format("%-10s %10s %10s\n", "Name", "Age", "Cost");
        System.out.format("%-10s %5d %10.3f\n\n", st, number1, floatingPoint);
        
        //the same except output to JOptionPane
        
        strout = String.format("%-10s %10s %10s %s", "Name", "Age", "Cost", nl);
        strout += String.format("%-10s %5d %10.3f\n\n", st, number1, floatingPoint); 
        
        JOptionPane.showMessageDialog(null, banner + strout);       
    
    // ***** closing message *****
    
        System.out.println();
        System.out.println("End of processing.");
    
    } // end of main method
    
} // end of public class
