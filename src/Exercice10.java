import java.util.Scanner;

public class Exercice10 {

    public static void main(String[] args) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        x = input.nextInt();

        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }
}
