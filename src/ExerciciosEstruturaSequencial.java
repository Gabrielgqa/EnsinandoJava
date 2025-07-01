import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args) {
        calculaOrcamentoPecasFor();
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

    public static void calculaOrcamentoPecas() {
        int code1, number1, code2, number2;
        double valorUnit1, valorUnit2, total;

        Scanner sc = new Scanner(System.in);

        code1 = sc.nextInt();
        number1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();

        code2 = sc.nextInt();
        number2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();

        total = number1 * valorUnit1 + number2 * valorUnit2;

        System.out.printf("VALOR A PAGAR: %.2f", total);
    }

    public static void calculaOrcamentoPecasFor(){
        int code, number;
        double valor, total;

        total = 0;



        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);

            code = sc.nextInt();
            number = sc.nextInt();
            valor = sc.nextDouble();

            total += number * valor;
        }

        System.out.printf("VALOR A PAGAR: %.2f", total);
    }

    public static void calcularAreas() {
        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = PI * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;


        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f", areaRetangulo);
    }
}
