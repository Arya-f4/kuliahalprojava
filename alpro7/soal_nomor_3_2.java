package alpro7;

public class soal_nomor_3_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};

        int maxSum = 0;
        int currentSum = arr[0];
        int start = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                currentSum += arr[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    end = i;
                }
            } else {
                currentSum = arr[i];
                start = i;
            }
        }

        System.out.println("Output: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nHasil: " + maxSum);
    }
}
