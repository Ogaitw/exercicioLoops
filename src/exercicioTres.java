import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horatotal=0;
        for (int i = 1; i < 30 ; i++) {
            System.out.println("Insira o total de horas trabalhadas "+ i +":");
            double horasDiarias = scanner.nextDouble();
            horatotal+=horasDiarias;
        }
        System.out.println("A horas totais trabalhada sao de:"+ horatotal);
    }
}
