import java.util.Scanner;

public class exercicioVinteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float compraTotal = 0;
        float etiqueta = 0;
        boolean validaCompra = true;
        float valorComDesconto = 0;
        float valorComAcrescimo = 0;
        String digitaletra;
        while (validaCompra) {
            System.out.println("Informe o preço da etiqueta:");
            etiqueta += scanner.nextFloat();
            System.out.println("Deseja continua a compra (S) para SIm e (N) para nao?");
            digitaletra = scanner.next();
            if (digitaletra.equalsIgnoreCase("N")) {
                validaCompra = false;
            } else if (digitaletra.equalsIgnoreCase("S")) {
                System.out.println("Digite o codigo de compras: \n 1= À vista em dinheiro ou cheque, com 10% de desconto \n" +
                        " 2= À vista com cartão de crédito, com 5% de desconto\n 3= Em 2 vezes, preço normal de etiqueta sem juro \n" +
                        " 4= Em 3 vezes, preço de etiqueta com acréscimo de 10%");
                int codigo = scanner.nextInt();
                if (codigo == 1) {
                    valorComDesconto += etiqueta * 0.90;
                    System.out.println("O valor Avista com desconte de 10% é de R$" + valorComDesconto);
                } else if (codigo == 2) {
                    valorComDesconto += etiqueta * 0.96;
                    System.out.println("O valor Avista com cartao de credito, desconte de 5% é de R$" + valorComDesconto);
                } else if (codigo == 3) {
                    System.out.println("Parelado em 2x sem Juros valor da parcela " + etiqueta / 2);
                }else if (codigo == 4) {
                    valorComAcrescimo += etiqueta/0.9;
                    System.out.println("Parelado em 3x  Juros com de 10%" + valorComAcrescimo);
                    compraTotal+= valorComAcrescimo++ + valorComDesconto++;
                }
            }
        }
    }
}