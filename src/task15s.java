import java.util.Scanner;

public class task15s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int number = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(number + " ");
            count++;

            if (count == number) {
                number++;
                count = 0;
            }
        }
    }
}