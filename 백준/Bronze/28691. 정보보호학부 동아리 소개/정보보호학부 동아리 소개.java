import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Map<String, String> map = new HashMap<>();
        map.put("M","MatKor");
        map.put("W","WiCys");
        map.put("C","CyKor");
        map.put("A","AlKor");
        map.put("$","$clear");
        if(map.containsKey(a)) {
            System.out.println(map.get(a));
        }
    }
}