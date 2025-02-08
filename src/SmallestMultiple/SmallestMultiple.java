package SmallestMultiple;

public class SmallestMultiple {
    public static void main(String[] args) {

        int number = 1, i = 1;
        while (i <= 20) {
            if (number % i == 0) {
                i++;
            } else {
                i = 1;
                number++;
            }
        }
        System.out.println(number);
    }
}
