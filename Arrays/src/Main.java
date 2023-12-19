import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* int[] list = {1, 2, 3, 4};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("==========");
        int sum = 0;
        for (int i : list) {
            sum += i;
            System.out.println(sum);
        } */

       /* int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matris.length; i++) {
            for (int k = 0; k < matris[i].length; k++) {
                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }     */

        // Array sınıfı ve methodları


       /* int[] list ={1,2,3,4,5,6};
        int[] list2 ={96,87,45,25,36,14,5,87,8};
        int[] list3 ={120,850,980,457,658,452};

        HelperArray helper = new HelperArray();
        helper.print(list3);
        HelperArray.print(list2)
*/
       /* int[] list ={1,2,3,4,5,6};
        int[] list2 ={96,105,45,25,36,14,5,87,8};
        int[] list3 ={120,850,980,457,658,452};
*/
/*        System.out.println(Arrays.toString(list2));

        Arrays.fill(list2 , 0,1,10);
        System.out.println(Arrays.toString(list2));*/

 /*       Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));*/

   /*     int index = Arrays.binarySearch(list2,25);
        System.out.println("25 in indeksi : " + index );*/

  /*      int [] copyList= Arrays.copyOf(list,list.length);
        System.out.println(Arrays.toString(copyList));

        int [] copyList2= Arrays.copyOfRange(list3,2,6);
        System.out.println(Arrays.toString(copyList2));*/

    /*    if (Arrays.equals(list3, list2)) {
            System.out.println("iki Dizi Birbirine eşit");

        } else {
            System.out.println("İki Dizi Birbirine eşit değil");
        }
*/
/* Toplama ve ortalama

        int[] list = {15,6,7,12,7,9,3};

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        double avarage = sum / list.length;
        System.out.println("List Arrayinin Ortalaması: " + avarage);
        */

        //Harmonik Serisi

        int[] list = {3,1,2,15,23,55};

        double harmonikseri = 0.0;

        for (int i = 0; i < list.length; i++) {
            harmonikseri += 1.0/list[i];
        }
        double harmonikOrtalamasi = list.length / harmonikseri;

        System.out.println("List Array'inin Harmonik Serisi : " + harmonikseri);
        System.out.println("List Array'inin Harmonik Ortalaması : " + harmonikOrtalamasi);
    }
}