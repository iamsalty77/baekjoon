import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int currentPassenger = k;

        for(int i = 0; i < n; i++) {
            int boarding = sc.nextInt();
            int unboarding = sc.nextInt();
            currentPassenger += boarding;
            currentPassenger -= unboarding;
        }
        System.out.println("비와이");
    }
}