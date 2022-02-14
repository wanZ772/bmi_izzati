import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner get_data = new Scanner(System.in);
	System.out.println("Enter weight (kg): ");
        
        int weight = get_data.nextInt();
        
        System.out.println("Enter height (meter): ");
        double height = get_data.nextDouble();
        double bmi = (weight / (height*height));
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        
        if (bmi <= 17)  {
             System.out.println("\nYou're underweight");
        }   else if (bmi <= 24)   {
            System.out.println("\nYou're normal");
        }   else    {
            System.out.println("\nYou're overweight");
        }

    }
}

