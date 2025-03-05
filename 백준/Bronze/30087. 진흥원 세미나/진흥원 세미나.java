import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String a = sc.nextLine();
            if(map.containsKey(a)) {
                System.out.println(map.get(a));
            }
        }
    }
}