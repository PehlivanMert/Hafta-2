import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int uzunluk = random.nextInt(100);
        int[] list = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            list[i] = random.nextInt(100); // 0 ile 99 arasında rastgele bir sayı ata
        }
        System.out.println("Arrayin uzunluğu : " + uzunluk + " Eleman");
        System.out.println("Oluşturulan Arrayiniz : " + Arrays.toString(list));
        System.out.println();

        System.out.print("Sayıyı Giriniz: ");
        int number = input.nextInt();


        BirKucukBirBuyuk.run(list, number);

    }
}




