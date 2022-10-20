import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double average = (n1 + n2 + n3) / 3;
        System.out.println("The average of " + n1 + " " + n2 + " " + n3 + " is " + average);
    }
}