import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalhoras = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println("Insira as horas trabalhadas Diariamente" + i);
            double horasDiarias= scanner.nextDouble();
            totalhoras+= horasDiarias;

        }
        System.out.println(" O Salário Bruto mensal é de R$ " + totalhoras * 10);
    }
}
