import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        
        for(int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int num : nums) {
            sum += num * num;
        }
        
        int verificationNumber = sum % 10;
        System.out.println(verificationNumber);
    }
}