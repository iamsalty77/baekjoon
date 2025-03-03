import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        List<String> originalPromises = new ArrayList<>();
        originalPromises.add("Never gonna give you up");
        originalPromises.add("Never gonna let you down");
        originalPromises.add("Never gonna run around and desert you");
        originalPromises.add("Never gonna make you cry");
        originalPromises.add("Never gonna say goodbye");
        originalPromises.add("Never gonna tell a lie and hurt you");
        originalPromises.add("Never gonna stop");

        boolean changed = false;
        for (int i = 0; i < N; i++) {
            String promise = scanner.nextLine();
            if (!originalPromises.contains(promise)) {
                changed = true;
                break;
            }
        }

        if (changed) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}