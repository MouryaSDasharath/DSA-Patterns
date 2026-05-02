package TwoPointers;

public class Prob_03_3_RemoveDuplicates2 {
	public static int removeDuplicates(int[] nums) {
        int index=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[index-2]){
                nums[index]=nums[i];
                index++;
            }else{
                continue;
            }
        }
        return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,3};
		int k=removeDuplicates(arr);
		System.out.print(k);	
	}
}
