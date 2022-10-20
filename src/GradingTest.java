import java.util.Scanner;

public class GradingTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        double s1 = input.nextDouble();
        if ((s1 < 0) || (s1 > 100)) {
            System.out.println("Please enter a valid score.");
        } else if ((s1 < 50)) {
            System.out.println("Score: " + s1 + "  Grade: FF  State: Failed.");
        } else if (s1 < 60) {
            System.out.println("Score: " + s1 + "  Grade: DD  State: Passed.");
        } else if (s1 < 65) {
            System.out.println("Score: " + s1 + "  Grade: DC  State: Passed.");
        } else if (s1 < 70) {
            System.out.println("Score: " + s1 + "  Grade: CC  State: Passed.");
        } else if (s1 < 75) {
            System.out.println("Score: " + s1 + "  Grade: CB  State: Passed.");
        } else if (s1 < 80) {
            System.out.println("Score: " + s1 + "  Grade: BB  State: Passed.");
        } else if (s1 < 85) {
            System.out.println("Score: " + s1 + "  Grade: BA  State: Passed.");
        } else if (s1 < 90) {
            System.out.println("Score: " + s1 + "  Grade: AB  State: Passed.");
        } else if (s1 <= 100) {
            System.out.println("Score: " + s1 + "  Grade: AA  State: Passed.");
        }
    }
}