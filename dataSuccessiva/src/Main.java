import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();

        System.out.println("La data di oggi e': " + oggi);
        LocalDate successivo = oggi.plusDays(1).plusMonths(1).plusYears(1);

        System.out.println("La data successiva: " + successivo);
    }
}