import java.util.Scanner;

public class exercicioSete {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o Valor");
            int N = scanner.nextInt();
            int h = 1;
            for (int i = 1; i <=  N ; i++) {
                h*=i;
            }
            System.out.println(h);
    }
}
