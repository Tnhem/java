import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your overall score: ");
        double overallscore = input.nextDouble();
        if (overallscore < 0) {
            System.out.println("Please enter a valid score.");
        } else if ((overallscore >= 0) && (overallscore < 50)) {
            System.out.println("Score: " + overallscore + "  Grade: FF  State: Passed.");
        } else if ((overallscore >= 50) && (overallscore < 60)) {
            System.out.println("Score: " + overallscore + "  Grade: DD  State: Passed.");
        } else if ((overallscore >= 60) && (overallscore < 65)) {
            System.out.println("Score: " + overallscore + "  Grade: DC  State: Passed.");
        } else if ((overallscore >= 65) && (overallscore < 70)) {
            System.out.println("Score: " + overallscore + "  Grade: CC  State: Passed.");
        } else if ((overallscore >= 70) && (overallscore < 75)) {
            System.out.println("Score: " + overallscore + "  Grade: CB  State: Passed.");
        } else if ((overallscore >= 75) && (overallscore < 80)) {
            System.out.println("Score: " + overallscore + "  Grade: BB  State: Passed.");
        } else if ((overallscore >= 80) && (overallscore < 85)) {
            System.out.println("Score: " + overallscore + "  Grade: BA  State: Passed.");
        } else if ((overallscore >= 85) && (overallscore < 90)) {
            System.out.println("Score: " + overallscore + "  Grade: AB  State: Passed.");
        } else if ((overallscore >= 90) && (overallscore <= 100)) {
            System.out.println("Score: " + overallscore + "  Grade: AA  State: Passed.");
        } else if (overallscore > 100) {
            System.out.println("Please enter a valid score.");
        }
    }
}