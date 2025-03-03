import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long firstSum = 0;
        for (int i = 1; i <= N; i++) {
            firstSum += i;
        }
        System.out.println(firstSum);
        long secondSum = 0;
        for (int i = 1; i <= N; i++) {
            secondSum += i;
        }
        System.out.println(secondSum * secondSum); // 제곱 직접 계산
        long thirdSum = 0;
        for (int i = 1; i <= N; i++) {
            thirdSum += i * i * i; // 세제곱 직접 계산
        }
        System.out.println(thirdSum);
    }
}