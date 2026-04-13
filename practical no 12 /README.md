PROGRAM 1: ARITHEMETIC EXCEPTION

public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

PROGRAM 2: ARRAY INDEX EXCEPTION

public class ArrayExample {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

PROGRAM 3: MULTIPLE CATCH BLOCKS

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int arr[] = new int[2];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error!");
        }
    }
}

PROGRAM 4: FINALLY BLOCK

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

PROGRAM 5: THROW KEYWORD

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible");
        }
    }
}

PROGRAM 6: THROWS KEYWORD

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);

        System.out.println(br.readLine());
    }
}
