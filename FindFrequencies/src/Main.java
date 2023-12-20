public class Main {
    public static void main(String[] args) {

        int[] arr = {27, 10, 22, 94, 75, 48, 36, 54, 10, 35, 27, 122, 94, 48, 90, 90, 48, 35,10};
        int[] freq = new int[123]; // Frekansları saklamak için bir dizi oluşturuyorum. Dizideki en büyük eleman 122 olduğu için boyutu 123 seçiyorum.

        for (int value : arr) { // Dizideki her eleman için
            freq[value]++; // Frekans dizisinin ilgili indeksini bir artırıyorum.
        }

        System.out.println("Element | Frequency"); // Element ve frekans başlıklarını yazdırıyorum
        for (int i = 0; i < freq.length; i++) {    // Frekans dizisindeki her indeks için
            if (freq[i] > 1) {                     // Eğer frekans birden büyükse
                System.out.println(i + " | "  + " sayısı "+ freq[i] + " kez tekrar edilmiş." ); // İndeks (element) ve frekans değerlerini ekrana yazdırıyorum.
            }
        }
    }
}
