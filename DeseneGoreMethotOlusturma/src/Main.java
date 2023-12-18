import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Deseni bulmak için bir sayı girin: ");
        int num = input.nextInt();
        PatternCreator(num, num, -1);
    }

    static void PatternCreator(int sabitSayi, int degiskenSayi, int isaret)
    {
        if(degiskenSayi > sabitSayi) return;
        if(degiskenSayi < 1) isaret *= -1;
        System.out.print(" " + degiskenSayi + " ");
        PatternCreator(sabitSayi, degiskenSayi  + isaret * 5, isaret);
    }
}
