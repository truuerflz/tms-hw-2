public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {12321, 367, 41, 5, 89, 989, 345, 6116, 222, 189, 23456789, 8656568};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int numLength = 0;
            while (num != 0) { //length of number
                numLength++;
                num = num / 10;
            }

            num = arr[i];
            boolean isPalindrome = true;
            for (int j = 0; j < numLength / 2; j++) { //palindrome check
                int head = num / (int)Math.pow(10, numLength - 2 * j - 1);
                int tail = num % 10;
                num = num % (int)Math.pow(10, numLength - 2 * j - 1);
                num /= 10;

                if (head != tail) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(arr[i]);
            }

        }
    }
}
