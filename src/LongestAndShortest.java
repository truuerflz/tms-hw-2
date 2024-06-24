public class LongestAndShortest {
    public static void main(String[] args) {

        int[] arr = {444, -375, 17, 666666, 77, 41212, 5, 10000000, -8367, 22};
        int longestIndex = 0, shortestIndex = 0;
        int longestDigit = 0, shortestDigit = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int digit = 0;
            while (elem != 0) {
                elem = elem / 10;
                digit++;
            }

            if (digit > longestDigit) {
                longestIndex = i;
                longestDigit = digit;
            }
            if (digit < shortestDigit) {
                shortestIndex = i;
                shortestDigit = digit;
            }
        }

        System.out.println("Longest number: " + arr[longestIndex] + ", shortest: " + arr[shortestIndex]);

    }
}
