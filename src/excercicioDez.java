import java.util.Scanner;

public class excercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precototal = 1;
        System.out.println("Digite a quantidade de Produto:");
        int quantidadeProduto = scanner.nextInt();
        while (quantidadeProduto < 0) {
            System.out.println("Insira uma quantidade valida");
            quantidadeProduto = scanner.nextInt();
        }
            for (int i = 0; i < quantidadeProduto; i++) {

                System.out.println("insira o valor da caixa " + i + ":");
                double valorCaixa = scanner.nextDouble();
                precototal = quantidadeProduto * valorCaixa;


            }
            System.out.println("O valor total é de:" + precototal);
        }
        }

