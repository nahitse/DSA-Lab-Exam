
import java.util.Arrays;

public class Solution4 {
    
    public static int findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

     
        return Arrays.stream(nums).max().orElseThrow();
    }

   
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; 
        int maxElement = findMax(nums); 
        System.out.println("The maximum element is: " + maxElement); 
    }
}

