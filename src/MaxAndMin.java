public class MaxAndMin {
    public static void main(String[] args) {

        int[] arr = {4, -3, 0, 6, 7, 4, 5, 10, -8, 2};
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {max = arr[i];}
            if (arr[i] < min) {min = arr[i];}
        }

        System.out.println("Max number from array: " + max + "; min: " + min);
    }
}