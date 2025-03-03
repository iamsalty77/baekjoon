import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String welcome = "WelcomeToSMUPC";
        int index = (N - 1) % welcome.length();
        System.out.println(welcome.charAt(index));
    }
}