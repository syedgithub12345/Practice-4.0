import java.util.*;
public class secondlargest {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int secondLargest = findSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
