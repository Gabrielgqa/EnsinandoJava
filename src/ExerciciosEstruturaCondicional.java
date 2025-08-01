import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaCondicional {
    public static void main(String[] args) {
        calculaImposto();
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

    public static void identificarEixoCoordenadas() {
        double x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0 ) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }

    public static void calculaImposto() {
        double salario, imposto;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        sc.close();

        if(salario <= 2000){
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }  else if (salario <= 4500.00) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
    }
}
