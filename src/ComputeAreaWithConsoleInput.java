import  java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a value
        System.out.println("Please enter a number for radius");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * 3.14159;

        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}