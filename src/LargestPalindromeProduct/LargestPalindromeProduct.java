package LargestPalindromeProduct;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int maxPalindrome = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (product <= maxPalindrome)
                    break;
                if (isPalindrome(product)) {
                    maxPalindrome = product;
                }
            }
        }

        System.out.println(maxPalindrome);
    }

    private static boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

