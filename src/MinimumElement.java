import java.util.Scanner;

public class MinimumElement {
    private static Scanner sc = new Scanner(System.in);
    private static int readInteger() {
        //Scanner sc = new Scanner(System.in); // In the exercise, you need to create two instances of the class Scanner for each of the two methods. This implementation is acceptable to the built-in Udemy compiler, but it throws an error in the IntelliJ IDEA, so here the instance of the class Scanner is declared as private static
        System.out.println("Введите количество символов для массива");
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    private static int[] readElements(int number) {
        int[] array = new int[number];
        //Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив длиной в " + number + " символов");
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) { //for-each loop
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(MinimumElement.findMin(MinimumElement.readElements(MinimumElement.readInteger())));
    }
}
