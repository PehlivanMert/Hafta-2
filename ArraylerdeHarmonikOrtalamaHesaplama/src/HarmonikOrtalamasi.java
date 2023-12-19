public class HarmonikOrtalamasi {
    int list[];

    public static void harmonikOrtalamaAlma(int[]list) {

        double harmonikOrtalama = 0.0;

        double harmonikseri = 0.0;


        for (int i = 0; i < list.length; i++) {
            harmonikseri += 1.0 / list[i];
        }

        harmonikOrtalama = list.length / harmonikseri;

        System.out.println("Array'in Harmonik Serisi : " + harmonikseri);
        System.out.println("------------------");
        System.out.println("Array'in Harmonik Ortalaması : " + harmonikOrtalama);
        System.out.println("==================");

    }
}
