import java.util.Scanner;

public class ExerciciosFor {
    public static void main(String[] args) {
        selecionaNumerosEntreDezEVinte();
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

    public static void selecionaNumerosEntreDezEVinte() {
        int n,valor, somaDentro = 0, somaFora = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            valor = sc.nextInt();
            if (valor >= 10 && valor <= 20)
                somaDentro++;
            else
                somaFora++;

        }

        System.out.println(somaDentro + " in");
        System.out.println(somaFora + " out");
    }
}
