public class Main {
    public static void main(String[] args) {

        // 5x3 boyutunda bir matrix tanımlıyoruz.
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

        // Matrisin boyutlarını alıyoruz.
        int row = matrix.length;
        int column = matrix[0].length;

        // Transpozunu alacağımız matrisin boyutlarına uygun bir yeni matrix tanımlıyoruz.
        int[][] transpoz = new int[column][row];

        // Matrisin transpozunu almak için iki tane iç içe for döngüsü kullanıyoruz.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                // Matrisin i. satır ve j. sütunundaki elemanı, yeni matrisin j. satır ve i. sütununa atıyoruz.
                transpoz[j][i] = matrix[i][j];
            }
        }

        // Matrisleri ekrana yazdırmak için iki tane iç içe for döngüsü daha kullanıyoruz.
        System.out.println("Matris:");
        for (int[] ints : matrix) {
            for (int j = 0; j < column; j++) {

                // Matrisin i. satır ve j. sütunundaki elemanı yazdırıyoruz.
                System.out.print(ints[j] + " ");
            }
            // Satır bittikten sonra bir alt satıra geçiyoruz.
            System.out.println();
        }
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {

                // Yeni matrisin i. satır ve j. sütunundaki elemanı yazdırıyoruz.
                System.out.print(transpoz[i][j] + " ");
            }
            // Satır bittikten sonra bir alt satıra geçiyoruz.
            System.out.println();
        }
    }
}
