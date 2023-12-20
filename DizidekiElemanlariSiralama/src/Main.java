import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int length = input.nextInt();                           //Dizinin boyutunu kullanıcıdan alıyoruz.

        int[] list = new int[length];
        for (int i = 0; i < length; i++) {                      // Dizinin boyutuna göre bir döngü oluşturuyoruz ve
            System.out.print(i + 1 + ".değeri giriniz : ");     // kullanıcıdan aldığımız değerleri arrayimize ekliyoruz.
            list[i] = input.nextInt();
        }
        Arrays.sort(list);                                      // Arrayimizi Arrays.sort ile sıralayıp ekrana yazdırıyoruz.
        System.out.println(" ");
        System.out.println("Arrayinizin küçükten büyüğe sıralanmış hali: " + Arrays.toString(list));
    }
}