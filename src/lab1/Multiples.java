package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println("There are " + multiples(1000, 5, 3));

    }

    public static int multiples(int n, int a, int b) {
        int fin = 0;
        int i = 1;
        while (i < n) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                fin++;

            } else if (divisibleBy3) {

                fin++;

            } else if (divisibleBy5) {

                fin++;

            }


            i++;
        }
        return fin;
    }
    public static int multiples() {
        return multiples(1000, 3, 5);
    }

}
