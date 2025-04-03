import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tc = 1; // Number of test cases
        // tc = scanner.nextInt();

        while (tc-- > 0) {
            solve(scanner);
        }

        scanner.close();
    }

    public static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
