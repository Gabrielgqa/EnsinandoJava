import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args) {
        calculaSalarioFuncionario();
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

    public static void diferencaDeProduto() {
        // função A * B - C * D
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("DIFERENÇA = "+ (A*B-C*D));
    }

    public static void calculaSalarioFuncionario() {
        int numeroFuncionario, horasTrabalhadas;
        double salarioHora;

        Scanner sc = new Scanner(System.in);
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        salarioHora = sc.nextDouble();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", numeroFuncionario, horasTrabalhadas * salarioHora);
    }
}
