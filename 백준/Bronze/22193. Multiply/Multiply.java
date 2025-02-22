import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        
        BigInteger product = a.multiply(b);
        System.out.println(product);

        scanner.close();
    }
}