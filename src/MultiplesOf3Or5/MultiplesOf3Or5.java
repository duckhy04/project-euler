package MultiplesOf3Or5;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        int max = 999;
        System.out.println("Method 1: " + method1(max));
        System.out.println("Method 2: " + (method2(3, max) + method2(5, max) - method2(15, max)));
    }

    private static int method2(int n, int max) {
        int p = max / n;
        return n * p * (p + 1) / 2;
    }

    private static int method1(int max) {
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
