import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email;
        int giorno, mese, anno;

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un giorno: ");
        giorno = in.nextInt();

        System.out.println("Inserisci un mese: ");
        mese = in.nextInt();

        System.out.println("Inserisci un anno: ");
        anno = in.nextInt();

        LocalDate data = LocalDate.of(anno, mese, giorno);
        LocalDate successivo = data.plusDays(1).plusMonths(1).plusYears(1);

        System.out.println("La data successiva: " + successivo);

    }
}