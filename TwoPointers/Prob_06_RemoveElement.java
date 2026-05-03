package TwoPointers;

public class Prob_06_RemoveElement {

	public static int removeElement(int[] nums, int val) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=val){
                nums[left++]=nums[right];
            }
        }
        return left;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,2,3,0,4,2};
		int k=removeElement(arr,2);
		System.out.print(k);
	}

}
