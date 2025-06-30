import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args) {
        calculaRaio();
    }

    public static void somaDoisNumeros(){
        int A, B;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        System.out.printf("SOMA = %d", A + B);
    }

    public static void calculaRaio(){
        double raio;
        double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();

        System.out.printf("A = %.4f", PI * Math.pow(raio, 2));
    }
}
