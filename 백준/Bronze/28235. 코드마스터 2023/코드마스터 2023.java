import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Map<String, String> map = new HashMap<>();
        map.put("SONGDO", "HIGHSCHOOL");
        map.put("CODE", "MASTER");
        map.put("2023", "0611");
        map.put("ALGORITHM", "CONTEST");
        if(map.containsKey(a)) {
            System.out.println(map.get(a));
        }
    }
}