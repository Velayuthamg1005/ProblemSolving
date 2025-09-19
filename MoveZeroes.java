import java.util.*;

public class MoveZeroes{

	public static int[] moveZeroes(int[] nums){
		int j=0;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j++]=temp;
			}
			
		}
		return nums;
	}
	public static void main(String[] args){
		int[] nums={0,1,0,3,12};
		
		System.out.println(Arrays.toString(moveZeroes(nums)));
	}
}

