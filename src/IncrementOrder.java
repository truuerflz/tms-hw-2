public class IncrementOrder {  // console output 12345
    public static void main(String[] args) {
        int[] arr = {12345, 367, 41, 5, 89, 923, 345, 6123, 222, 189, 23456789, 8654, 4235653};

        for (int i = 0; i < arr.length; i++) {
            boolean isIncrement = true;
            int num = arr[i];

            while (num > 9) {
                int elem = num % 10;
                num = num / 10;
                if (num % 10 + 1 != elem) {
                    isIncrement = false;
                    break;
                }
            }

            if (isIncrement) {
                System.out.println(arr[i]);
            }

        }
    }
}
