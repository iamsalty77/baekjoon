import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long sum = x + y;
            System.out.println(sum);
        }
    }
}