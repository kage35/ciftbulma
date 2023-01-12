public class asalsayi {
    public static void main(String[] args) {

        int counter = 0;
        int i, j;

        for (i = 1; i < 100; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(" " + i);
            }
            counter = 0;
        }
    }
}