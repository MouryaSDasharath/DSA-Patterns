package TwoPointers;
import java.util.*;
public class Prob_07_3Sum {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    k--;
                    j++;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
            }
        }
        return ans;
    }

	public static void main(String[] args) {
	    int[] nums = {-1, 0, 1, 2, -1, -4};

	    List<List<Integer>> result = threeSum(nums);

	    for (List<Integer> triplet : result) {
	        System.out.println(triplet);
	    }
	}

}
