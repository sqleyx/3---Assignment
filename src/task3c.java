import java.util.Scanner;

public class task3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int x = (int) Math.sqrt(i);

            if (x * x == i) {
                System.out.print(i + " ");
            }
        }
    }
}