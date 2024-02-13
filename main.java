// Practicum 11 (Largest of Three Program)
// (TO COMPLETE)
import java.util.*;

public class main {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;

        Scanner input = new Scanner(System.in);

        // prompt user for three numbers
        System.out.print("Enter 3 numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
       
        // determine largest and assign to variable largest
        largest = 0;

        if(num1>num2){
            largest = num1;
        }
        else{
            largest = num2;
        }

        if(largest>num3){
            largest = largest;
        }
        else{
            largest = num3;
        }
        
        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}
