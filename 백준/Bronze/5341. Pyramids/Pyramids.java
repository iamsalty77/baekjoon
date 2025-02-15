import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            if(a==0) {
                break;
            }
            int sumBlock = calculateBlock(a);
            System.out.println(sumBlock);
        }
    }
    public static int calculateBlock(int a) {
        int sumBlock = 0;
        for(int i = a; i >= 1; i--) {
            sumBlock += i;
        }
        return sumBlock;
    }
}