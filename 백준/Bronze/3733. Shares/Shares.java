import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int result = s / (n+1);
            System.out.println(result);
        }
    }
}