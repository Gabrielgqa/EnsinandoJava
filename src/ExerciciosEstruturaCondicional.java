import java.util.Scanner;

public class ExerciciosEstruturaCondicional {
    public static void main(String[] args) {
        parOuImpar();
    }

    public static void negativoOuPositivo() {
        int number;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }

    public static void parOuImpar() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}
