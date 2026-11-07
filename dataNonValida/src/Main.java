import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email;
        String data1;

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la data nella forma 'aaaa-mm-gg': ");
        data1 = in.next();

        LocalDate data2 = LocalDate.parse(data1);
        System.out.println("La data non valida: " + data2);

    }
}