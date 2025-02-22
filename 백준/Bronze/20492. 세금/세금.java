import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n-(n * 22 / 100);
        long b = n-((n * 20 / 100) * 22 / 100);
        System.out.println(a + " " + b);
    }
}