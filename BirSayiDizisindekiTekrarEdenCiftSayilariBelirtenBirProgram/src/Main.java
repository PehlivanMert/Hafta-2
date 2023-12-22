public class Main {
    static boolean isFind(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {27, 10, 22, 94, 75, 43, 36, 54, 10, 35, 27, 122, 94, 48, 90, 90, 48, 35};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                        break;
                    }
                }
            }

        }

        System.out.print("[ ");
        for(int value :duplicate) {
            if (value != 0 && value % 2 == 0) {
            System.out.print(value + ", ");
            }
        }
        System.out.print("]");
}
}
