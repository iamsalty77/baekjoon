import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
        
        BigInteger[] result = n.divideAndRemainder(m);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}