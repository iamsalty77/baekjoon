import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        if(B>A) {
            System.out.println("Bus");
        }else if(B==A) {
            System.out.println("Anything");
        }else {
            System.out.println("Subway");
        }

        }
    }