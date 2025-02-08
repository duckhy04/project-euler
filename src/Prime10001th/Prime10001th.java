package Prime10001th;

public class Prime10001th {
    public static void main(String[] args) {
        int limit = 100;
        int count = 0;
        System.out.println("Prime numbers between 1 and " + limit);
        for (int i = 2; i < 1000000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                count++;
                System.out.println(count);
            }
        }
    }
}
