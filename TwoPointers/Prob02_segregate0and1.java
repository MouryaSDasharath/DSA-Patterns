package TwoPointers;

public class Prob02_segregate0and1 {
	
	public static void segregate0and1(int[] arr) {
        int left=0,right=arr.length-1;
        
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else if(arr[left]==1 && arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,0};
		segregate0and1(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
