public class IncrementOrderExtra {  // console output 1, 2, 3, 4
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 5, 8, 9, 3, 6, 2, 1, 2, 8, 4, 5};
        boolean beginOfRow = true;


        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] - 1) {

                if (beginOfRow) {
                    System.out.print(arr[i] + " " + arr[i + 1] + " ");
                    beginOfRow = false;
                } else {
                    System.out.print(arr[i + 1] + " ");
                }

            } else if (!beginOfRow) {
                beginOfRow = true;
                System.out.println();
            }
        }
    }
}
