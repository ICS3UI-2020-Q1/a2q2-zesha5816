import java.util.Scanner;
/**
 * which of the 2 numbers input is the largest one.
 * @author Ahmad Zeshan 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		// create a Scanner for user input
		Scanner input = new Scanner(System.in);
		//prompts user to enter a integer input
		System.out.println("Please enter an integer:");
		//gets input from user
		int x = input.nextInt();
		//prompts user for another integer
		System.out.println("Please enter another integer:");
		//gets the input from user
		int x1 = input.nextInt();
		//checks whihc number is bigger and outputs the result accordingly
		if (x1 > x){
			System.out.println("The biggest number is " + x1 + "." );
		}
		else if (x > x1){
			System.out.println("The biggest number is " + x + ".");
		} else{
			System.out.println("There is no biggest number.");
		}
    
  }
}
