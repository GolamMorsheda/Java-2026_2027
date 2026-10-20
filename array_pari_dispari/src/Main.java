import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];

        scelta = in.nextInt();
        for (int i = 0; i < scelta; i++) {
            a[i] = i;
            
        }
    }
}