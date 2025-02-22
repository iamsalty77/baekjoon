import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                scanner.nextInt();
            }

            System.out.println("Case " + caseNum + ": Sorting... done!");
            caseNum++;
        }

        scanner.close();
    }
}