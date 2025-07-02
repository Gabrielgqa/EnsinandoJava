import java.util.Scanner;

public class ExerciciosWhile {
    public static void main(String[] args) {
        pesquisaPosto();
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

    public static void indicaQuadranteCoordenadas() {
        int X, Y;

        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != 0 && Y != 0){
            if(X > 0 && Y > 0){
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0){
                System.out.println("segundo");
            } else if (X < 0 && Y < 0){
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }

    public static void pesquisaPosto() {
        int tipo, somaGasolina = 0, somaAlcool = 0, somaDiesel = 0;

        Scanner sc = new Scanner(System.in);
        tipo = sc.nextInt();

        while (tipo != 4){
            if(tipo == 1){
                somaAlcool += 1;
            } else if (tipo == 2){
                somaGasolina += 1;
            } else if (tipo == 3){
                somaDiesel += 1;
            }

            tipo = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", somaAlcool, somaGasolina, somaDiesel);
    }
}
