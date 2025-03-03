import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double W = sc.nextDouble();
        Double H = sc.nextDouble();
        Double result = W * H / 2.0;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(result));
    }

}