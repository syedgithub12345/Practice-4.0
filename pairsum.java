import java.util.*;
public class pairsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 7;

        int i = 0, j = arr.length - 1;
        boolean found = false;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                found = true;
                break;
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if(!found) System.out.println("No Pair Found");
    }
}
