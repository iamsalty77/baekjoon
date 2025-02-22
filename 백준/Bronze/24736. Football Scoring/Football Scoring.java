import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] visiting = new int[5];
        for(int i = 0; i < visiting.length; i++) {
            visiting[i] = sc.nextInt();
        }

        int[] home = new int[5];
        for(int i = 0; i < home.length; i++) {
            home[i] = sc.nextInt();
        }

        int visitingScore = calculateScore(visiting);
        int homeScore = calculateScore(home);

        System.out.println(visitingScore + " " + homeScore);

    }



        public static int calculateScore(int[] score) {
            int touchdowns = score[0];
            int fieldGoals = score[1];
            int safeties = score[2];
            int pointsAfter = score[3];
            int conversions = score[4];
            return (touchdowns*6) + (fieldGoals*3) + (safeties*2) + (pointsAfter) + (conversions*2);
        }

}