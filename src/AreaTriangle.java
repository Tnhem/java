import java.util.Scanner;
import java.lang.Math;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 triangle sides: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double s = (n1 + n2 + n3) / 2;
        if (n1 - n2 < n3 && n1 - n3 < n2 && n2 - n3 < n1 && n1 > 0 && n2 > 0 && n3 > 0) {
            System.out.println("This is a valid triangle.");
            System.out.println("The area of triangle is: " + Math.sqrt(s * (s - n1) * (s - n2) * (s - n3)));
        } else {
            System.out.println("Please enter valid triangle sides.");
        }
    }
}
