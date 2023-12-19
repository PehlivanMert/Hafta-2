import java.util.Arrays;

public class BirKucukBirBuyuk {


    static void run(int[] list, int number) {



        Arrays.sort(list);
        System.out.println(" ");
        System.out.println("Arrayinizin büyükten küçüğe sıralanmış hali: " + Arrays.toString(list));

        boolean isFound = false;

        for (int element : list) {

            if (element == number) {

                for (int i = 0; i < list.length; i++) {

                    if (list[i] == number) {

                        int a = i - 1;
                        int b = i + 1;
                        int kucuk = list[a];
                        int buyuk = list[b];

                        System.out.println(" ");
                        System.out.println("Küçük sayı : " + kucuk);
                        System.out.println("Büyük sayı : " + buyuk);
                        isFound = true;
                    }
                }
            }
        }
        if (!isFound) {
            System.out.println("Lütfen Farklı Bir Sayı Girin!");
        }
    }
}
