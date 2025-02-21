import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buddhistYear = scanner.nextInt(); // 불기 연도 입력

        int westernYear = buddhistYear - 543; // 불기 연도를 서기 연도로 변환

        System.out.println(westernYear); // 서기 연도 출력
    }
}