public class HarmonikOrtalamasi {
    public static void harmonikOrtalamaAlma(int[]list) {

        double harmonikOrtalama;
        double harmonikseri = 0;


        for (int j : list) {
            harmonikseri += 1.0 / j;
        }

        harmonikOrtalama = list.length / harmonikseri;

        System.out.println("Array'in Harmonik Serisi : " + harmonikseri);
        System.out.println("------------------");
        System.out.println("Array'in Harmonik Ortalaması : " + harmonikOrtalama);
        System.out.println("==================");

    }
}
