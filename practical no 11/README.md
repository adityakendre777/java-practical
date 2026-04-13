PRINTNNG PATTERN PROGRAM USING ITERATION

class PatternIterative {

    static void printPattern(int size) {

        int maxWidth = 2 * size - 1;

        for (int i = 1; i <= size; i++) {

            int stars;

            if (i <= (size + 1) / 2) {
                stars = 1 + 4 * (i - 1);
            } else {
                stars = 1 + 4 * (size - i);
            }

            int spaces = (maxWidth - stars) / 2;

            // Print spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int st = 1; st <= stars; st++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}



PRINTING PATTERN PROGRAM USING RECURSION

class PatternRecursive {

    static void printPattern(int size) {
        int maxWidth = 2 * size - 1;
        printRow(1, size, maxWidth);
    }

    static void printRow(int i, int size, int maxWidth) {

        if (i > size)
            return;

        int stars;

        if (i <= (size + 1) / 2) {
            stars = 1 + 4 * (i - 1);
        } else {
            stars = 1 + 4 * (size - i);
        }

        int spaces = (maxWidth - stars) / 2;

        printSpaces(spaces);
        printStars(stars);

        System.out.println();

        printRow(i + 1, size, maxWidth);
    }

    static void printSpaces(int n) {
        if (n == 0)
            return;

        System.out.print(" ");
        printSpaces(n - 1);
    }

    static void printStars(int n) {
        if (n == 0)
            return;

        System.out.print("*");
        printStars(n - 1);
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
