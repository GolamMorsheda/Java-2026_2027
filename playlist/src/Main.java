import java.time.Duration;

public class Main {
    public static void main(String[] args){
        Canzone c = new Canzone("bho", "bobby", Duration.ofMinutes(3));

        System.out.println(c.toString());

    }
}