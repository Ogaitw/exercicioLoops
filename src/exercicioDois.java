import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorGasto = 0;
        for (int i = 1; i <= 45; i++) {
            System.out.println("insira a quantidade de Caixa: " + i);
            int quantidadeDeCaixa = scanner.nextInt();
            System.out.println("Insira o Valor das Caixas: " + i);
            double valorDaCaixa = scanner.nextDouble();
            valorGasto += quantidadeDeCaixa*valorDaCaixa;
        }
        System.out.println("O valor Total Gasto é de:" + valorGasto);
    }
}

