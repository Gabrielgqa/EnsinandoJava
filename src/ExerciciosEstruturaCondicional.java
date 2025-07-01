import java.util.Scanner;

public class ExerciciosEstruturaCondicional {
    public static void main(String[] args) {
        verificaIntervalo();
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

    public static void multiploOuNao() {
        int A, B;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
    }

    public static void duracaoJogo(){
        int start, end, total;

        Scanner sc = new Scanner(System.in);

        start = sc.nextInt();
        end = sc.nextInt();

        if (start < end){
            total = end - start;
        } else if (start == end) {
            total = 24;
        } else {
            total = 24 - start + end;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", total);
    }

    public static void precoLanche() {
        int codigo, quantidade;
        double total;

        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        sc.close();

        switch (codigo) {
            case 1:
                total = quantidade * 4.0;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5.0;
                break;
            case 4:
                total = quantidade * 2.0;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                total = 0;
                break;
        }

        System.out.printf("Total: R$ %.2f", total);
    }

    public static void verificaIntervalo() {
        double valor;

        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble();
        sc.close();

        if (valor >= 0 && valor <= 100){
            if (valor <= 25 ) {
                System.out.println("Intervalo [0, 25]");
            } else if (valor <= 50){
                System.out.println("Intervalo [25, 50]");
            } else if (valor <= 75){
                System.out.println("Intervalo [50, 75]");
            } else {
                System.out.println("Intervalo [75, 100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
