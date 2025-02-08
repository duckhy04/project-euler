package SumSquareDifference;

public class SumSquareDifference {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += Math.pow(i, 2);
        }

        for (int i = 1; i <= 100; i++) {
            sum2 += i;
        }
        sum2 = Math.pow(sum2, 2);
        double sum = sum2 - sum1;
        System.out.printf("%.0f%n", sum);
    }
}
