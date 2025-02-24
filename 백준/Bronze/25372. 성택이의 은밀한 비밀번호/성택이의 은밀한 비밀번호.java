import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String a = sc.next();
            if(a.length() >= 6 && a.length() <= 9) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            
        }
    }
}