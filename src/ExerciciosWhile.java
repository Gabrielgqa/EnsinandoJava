import java.util.Scanner;

public class ExerciciosWhile {
    public static void main(String[] args) {
        senhaCorreta();
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

    public static void senhaCorreta(){
        String senha;
        String senhaCorreta = "2002";
        Scanner sc = new Scanner(System.in);
        senha = sc.next();

        while (!senha.equals(senhaCorreta)){
            System.out.println("Senha Inválida");
            senha = sc.next();
        }

        System.out.println("Acesso Permitido");
    }
}
