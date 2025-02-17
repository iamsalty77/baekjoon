import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-- > 0) {
            String b = sc.next();
            System.out.print(b.charAt(0));
            System.out.println(b.charAt(b.length()-1));
        }
    }
}