import java.util.Scanner;

public class Main {
    static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = base * power(base, pow - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int base = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int pow = input.nextInt();
        System.out.println("Sonuç: " + power(base,pow));
    }
}