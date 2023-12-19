public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Haydar", 10, 120, 100, 25);
        Fighter f2 = new Fighter("Osman", 12, 85, 85, 35);

        Ring match = new Ring(f1, f2, 80, 110);
        match.run();

    }
}