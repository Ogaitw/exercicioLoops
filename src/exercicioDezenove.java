import java.util.Scanner;

public class exercicioDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 1;
        String opniao;
        boolean validador;
        int contador = 0;
        int total_idades = 0;
        float quant_A = 0;
        float quant_B = 0;
        float quant_C = 0;
        float quant_D = 0;
        float quant_E = 0;
        while (idade > 0) {
            validador = true;
            System.out.println("Digite a idade do intrevistado");
            idade = scanner.nextInt();
            if (idade < 0) {
                break;
            }
            System.out.println("Digite a opinião: \n A- Otimo \n B- Bom \n C- Regular \n D= Ruim \n E Péssimo ");
            opniao = scanner.next();


            if (opniao.equalsIgnoreCase("A")) {
                quant_A++;
            } else if (opniao.equalsIgnoreCase("B")) {
                quant_B++;
            } else if (opniao.equalsIgnoreCase("C")) {
                quant_C++;
            } else if (opniao.equalsIgnoreCase("D")) {
                quant_D++;
            } else if (opniao.equalsIgnoreCase("E")) {
                quant_E++;
            } else {
                System.out.println("Você digitou uma Letra invalida o teste sera reiniciado.");
                validador = false;
            }
            if (validador) {
                total_idades += idade;
                contador++;
            }

        }
        System.out.println("Quantidade de Pessoas Intrevistadas foi de: " + contador + "\n Medias das idadades: " + total_idades / contador);
        System.out.printf("Porcentagem de pessoas que reponderam suas opiniões:\n A= %.2f%% \n B= %.2f%% \n C= %.2f%% \n D= %.2f%% \n E= %.2f%%", (quant_A / contador) * (100), (quant_B / contador) * (100), (quant_C / contador) * (100), (quant_D / contador) * (100), (quant_E / contador) * (100));
    }
}
