import java.util.Scanner;

public class excercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite um Numero: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }


        }
        System.out.println(" O Numero maior é: "+maiorNumero);
    }
}
