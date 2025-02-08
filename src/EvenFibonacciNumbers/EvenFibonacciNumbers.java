package EvenFibonacciNumbers;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int sumEven = 0;

        while (b <= 4000000) {
            if (b % 2 == 0) {
                sumEven += b;
            }
            int next = a + b;
            a = b;
            b = next;
            System.out.println(b);
        }

        System.out.println(sumEven);

    }
}
