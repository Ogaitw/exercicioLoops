import java.util.Scanner;

public class exercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroMaior = 0;
        int numeroMenor = 0;
        for (int i = 0; i < 20; i++) {
        System.out.println("Digite um numero: ");
           int numeroDIgitado = scanner.nextInt();
           if (numeroMenor == 0) {
               numeroMenor = numeroDIgitado;
           }

        if (numeroDIgitado > numeroMaior){
            numeroMaior = numeroDIgitado;

        }
        else if (numeroDIgitado < numeroMenor) {
            numeroMenor = numeroDIgitado;
        }

        }
        System.out.println("O maior numero é: " + numeroMaior + " O menor numero é: "+ numeroMenor);
    }
}
