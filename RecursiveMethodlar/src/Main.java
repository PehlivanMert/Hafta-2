public class Main {

    //Toplama
    static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        int result = sum(n - 1) + n;
        return result;
    }

    //Faktöriyel
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int result = fact(n - 1) * n;

        return result;
    }

    //Üs alma
    static int power(int base,int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = base * power(base, pow -1);
                return result;
    }

    static int fibo(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);

    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(fact(5));
        System.out.println(power(5,2));
        System.out.println(fibo(30));
    }
}