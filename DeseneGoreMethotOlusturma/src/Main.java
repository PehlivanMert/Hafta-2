import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Deseni bulmak için bir sayı girin: ");
        int num = input.nextInt();
        PatternCreator(num, num, -1);
    }

    /* sabitSayi: Desenin kaç adet sayı içereceğini belirten sayı.
    degiskenSayi: Desende kullanılan değişken sayıdır. Bu sayı, her çağrıda isaret değeri ile artırılır veya azaltılır.
    isaret: Desenin nasıl arttırılacağını veya azaltılacağını belirten bir işaret değeridir. */
    static void PatternCreator(int sabitSayi, int degiskenSayi, int isaret)
    {
        if(degiskenSayi > sabitSayi) return;           // Eğer degiskenSayi sabitSayi'den büyükse, fonksiyon sona erer.
        if(degiskenSayi < 1) isaret *= -1;             // Eğer degiskenSayi 1'den küçükse, isaret'in tersini alır.
        System.out.print(" " + degiskenSayi + " ");    // Deseni ekrana yazdırırız.
        PatternCreator(sabitSayi, degiskenSayi  + isaret * 5, isaret); // // Recursive olarak fonksiyonu çağırırız.
    }
}
