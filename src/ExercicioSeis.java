import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor");
        int N = scanner.nextInt();
        int h = 0;
        for (int i = 0; i <=  N ; i++) {
        h+=i;

        }
        System.out.println(h);
    }
}
