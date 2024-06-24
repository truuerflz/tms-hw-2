public class EvenAndOdd {
    public static void main(String[] args) {

        int[] arr = {4, -3, 0, 6, 7, 4, 5, 10, -8, 2};

        System.out.print("Even numbers: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i : arr) {
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.print(i + " ");
            }
        }
    }
}
