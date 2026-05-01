package TwoPointers;

public class Prob_05_LeetcodeApplyTransformation {
	// public void moveZero(int [] arr){
    //     int right=arr.length-1,left=0;
    //     while(left<right){
    //         if(arr[left]>0){
    //             left++;
    //         }
    //         else if(arr[right]==0){
    //             right--;
    //         }
    //         else if(arr[left]==0 && arr[right] !=0){
    //             int temp=arr[left];
    //             arr[left]=arr[right];
    //             arr[right]=temp;

    //             left++;
    //             right--;
    //         }
    //     }
    // }
    public void moveZero(int[] arr) {
    int insertPos = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[insertPos++] = arr[i];
        }
    }

    while (insertPos < arr.length) {
        arr[insertPos++] = 0;
    }
}
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        moveZero(nums);
        return nums;
    }
    
    public static void main(String[] args) {
        Prob_05_LeetcodeApplyTransformation obj = new Prob_05_LeetcodeApplyTransformation();

        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};

        int[] result = obj.applyOperations(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
