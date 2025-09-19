import java.util.*;

public class TwoSum2{
	
	public static int[] twoSum2(int[] nums,int target){
		int i=0;
		int j=nums.length-1;

		while(i<j){
			int sum=nums[i]+nums[j];

			if(sum>target){
				j--;
			}
			else if(sum==target){
				return new int[]{i+1,j+1};
			}
			else{
				i++;
			}
		}
		return null;
	}

	
	public static void main(String[] args){
		int[] nums={2,7,11,15};
		int target=9;

		System.out.println(Arrays.toString(twoSum2(nums,target)));
	}
}