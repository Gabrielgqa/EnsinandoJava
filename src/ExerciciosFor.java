import java.util.Scanner;

public class ExerciciosFor {
    public static void main(String[] args) {
        somaFor();
    }

    public static void somaFor() {
        int n,valor, soma = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            valor = sc.nextInt();

            soma += valor;
        }

        System.out.println(soma);
    }

    public static void mostraImparesAteN(){
        int X;

        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        for (int i = 1; i <= X; i+=2){
            System.out.println(i);
        }
    }
}
