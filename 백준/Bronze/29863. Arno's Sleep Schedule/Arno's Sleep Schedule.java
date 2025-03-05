import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int result;
        if(a >= 20 && a <= 23) {
            result = 24 - a + b;
            System.out.println(result);
        }else {
            result = b - a;
            System.out.println(result);
        }
    }
}