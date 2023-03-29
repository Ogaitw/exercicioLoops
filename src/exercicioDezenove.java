import java.util.Scanner;

public class exercicioDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int idade = 1;
      String opniao;
      int contador= 0;

      while (idade>0) {

          System.out.println("Digite a idade do intrevistado");
          idade = scanner.nextInt();
          if (idade < 0) {
              break;
          }
          System.out.println("Digite a opinião: \n A- Otimo \n B- Bom \n C- Regular \n D= Ruim \n E Péssimo ");
          opniao = scanner.next();
          contador++;
      }
        System.out.println("Quantidade de Pessoas Intrevistadas foi de: "+contador);
    }
}
