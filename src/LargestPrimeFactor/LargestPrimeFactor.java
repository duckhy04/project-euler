package LargestPrimeFactor;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 13195L;
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
            }
        }
        System.out.println(number);
    }
}
