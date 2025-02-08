package LargestProductinaSeries;

public class LargestProductinaSeries {
    public static void main(String[] args) {
        String numbers = "7316";
        int max = 0;
        for (int i = 0; i < numbers.length(); i++) {
            System.out.println(numbers.charAt(i + 1));
        }
        System.out.println(max);
    }
}
