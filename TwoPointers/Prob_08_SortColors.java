package TwoPointers;

public class Prob_08_SortColors {
	 public static void sortColors(int[] nums) {
	        int low=0,mid=0,high=nums.length-1;
	        while(mid<=high){
	            if(nums[mid]==0){
	                int temp=nums[mid];
	                nums[mid]=nums[low];
	                nums[low]=temp;

	                low++;
	                mid++;
	            }else if (nums[mid]==1){
	                mid++;
	            }else{
	                int temp=nums[high];
	                nums[high]=nums[mid];
	                nums[mid]=temp;

	                high--;
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,2,2,1,0,0,0,2,2,1};
		sortColors(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
