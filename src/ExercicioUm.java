import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoTotal = 0;
        for (int i = 1; i <= 25 ; i++) {
            System.out.println(" Insira  o peso da caixa " + i + ":");
            double pesoCaixa = scanner.nextDouble();
            pesoTotal += pesoCaixa;
            
        }
        System.out.println("O peso total sao de:"+ pesoTotal + "Kg");
    }
}