import java.util.Scanner;

public class Main {

    // Verilen sayının asal olup olmadığını kontrol eden metot
    static boolean asalMi(int n, int bolen) {
        // Eğer n 1 veya daha küçükse, asal değildir.
        if (n <= 1) {
            return false;
        }
        // Eğer bölen * bölen n'den büyükse, n asaldır (asal bölenleri zaten kontrol edildi).
        if (bolen * bolen > n) {
            return true;
        }
        // Eğer n bölen ile bölünüyorsa, asal değildir.
        if (n % bolen == 0) {
            return false;
        }
        // Yukarıdaki koşulların hiçbiri sağlanmazsa, n'in asal bölenlerini kontrol etmek için
        // bir sonraki bölene geçmek için recursive bir çağrı yapılır.
        return asalMi(n, bolen + 1);
    }

    static boolean asalMi(int n) {
        // İlk çağrıyı bölen = 2 ile yaparak işlem başlatılır.
        return asalMi(n, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için bir Scanner nesnesi oluşturulur.
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt(); // Kullanıcıdan bir sayı girdisi alınır.


        // Girilen sayının asal olup olmadığını kontrol etmek için asalMi metodu kullanılır.
        boolean asalSonuc = asalMi(sayi);

        // Sonuca göre ekrana bir mesaj yazdırılır.
        System.out.println(sayi + (asalSonuc ? " sayısı asaldır." : " sayısı asal değildir."));
    }
}