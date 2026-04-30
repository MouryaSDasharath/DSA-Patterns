package TwoPointers;

public class prob_04_sortedSquares {

	public static  int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        int index=n-1;
        int []res=new int[n];


        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];

            if(leftsq>rightsq){
                res[index]=leftsq;
                left++;
            }else{
                res[index]=rightsq;
                right--;
            }
            index--;
        }
        return res;
    }
	public static void main(String[] args) {
		int [] arr= {-4,-1,0,1,3,10};
		int res[]=sortedSquares(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
