import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();


        if (n.equals(m)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}