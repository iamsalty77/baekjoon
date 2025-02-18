import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for(int num : a) {
            if(num < x) {
                System.out.print(num + " ");
            }
        }
    }
}