import java.util.Scanner;

public class ExerciciosWhile {
    public static void main(String[] args) {
        somaAteZero();
    }

    public static void somaAteZero() {
        int valor, soma;
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();

        soma = 0;

        while (valor != 0){
            soma += valor;
            valor = sc.nextInt();
        }
        sc.close();
        System.out.println(soma);
    }
}
