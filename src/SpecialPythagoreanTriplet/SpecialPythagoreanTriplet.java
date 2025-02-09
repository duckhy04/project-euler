package SpecialPythagoreanTriplet;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                double pythagorean = Math.pow(i, 2) + Math.pow(j, 2);
                if (Math.sqrt(pythagorean) + i + j == 1000) {
                    double product = Math.sqrt(pythagorean) * i * j;
                    System.out.printf("%.0f%n", product);
                    return;
                }
            }
        }
    }
}
