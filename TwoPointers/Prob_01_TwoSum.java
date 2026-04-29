package TwoPointers;
import java.util.*;

public class Prob_01_TwoSum {
	public static int [] twoSum(int[] arr,int target) {
		int left=0,right=arr.length-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				return new int[] {arr[left],arr[right]};
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,7,10,11,15};
		int target=15;
		int [] res=twoSum(arr,target);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
