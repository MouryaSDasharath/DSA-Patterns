package TwoPointers;
import java.util.*;

public class Prob_03_removeDuplicates {
	public static int removeDuplicates(int[] nums) {
        int left=1;
        for(int right=1;right<nums.length;right++){
            if(nums[right-1]!=nums[right]){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
	public static void main(String args[]) {
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		int n=removeDuplicates(arr);
		System.out.println(n);
	}
}
