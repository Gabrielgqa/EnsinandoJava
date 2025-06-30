import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args) {
        somaDoisNumeros();
    }

    public static void somaDoisNumeros(){
        int A, B;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        System.out.printf("SOMA = %d", A + B);
    }
}
