import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        int needKing = 1 - king;
        int needQueen = 1 - queen;
        int needRook = 2 - rook;
        int needBishop = 2 - bishop;
        int needKnight = 2 - knight;
        int needPawn = 8 - pawn;

        System.out.print(needKing + " ");
        System.out.print(needQueen + " ");
        System.out.print(needRook + " ");
        System.out.print(needBishop + " ");
        System.out.print(needKnight + " ");
        System.out.println(needPawn);

    }
}