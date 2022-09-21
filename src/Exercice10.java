import java.util.Scanner;

public class Exercice10 {

    public static void main(String[] args) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        x = input.nextInt();

        if (x>=0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

    }
}
