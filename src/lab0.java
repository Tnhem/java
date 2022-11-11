import java.util.Scanner;

public class lab0 {

    public static void main(String[] args) {
        int a = (int) Math.floor(Math.random() * 1000);
        int b = (int) Math.floor(Math.random() * 1000);
        int gcd = 0;
        if (a < b) {
            a = a ^ b ^ (b = a);
        }
        System.out.println("what method do you want to use, choose 1 or 2");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            //bruteforce
            System.out.println(a + " " + b);
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
            } else if (x == 2) {
            //Euclidean Algorithm
            System.out.println(a + " " + b);
            int k;
            while (a != 0 && b != 0) {
                k = a % b;
                a = b;
                b = k;
            }
            System.out.println(a);
        }
    }
}
