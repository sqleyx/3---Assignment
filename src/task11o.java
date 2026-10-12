import java.util.Scanner;

public class task11o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean hasZero = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                hasZero = true;
            }
        }

        if (hasZero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}