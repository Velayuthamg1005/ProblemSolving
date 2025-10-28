import java.util.*;

class RemoveDuplicates{
	public static void main(String[] args){
		int[] nums={0,0,1,1,1,2,2,3,3,4};
		
		int i=1;
		int j=0;
		
		while(i<nums.length){
			if(nums[i]!=nums[j]){
				j++;
				nums[j]=nums[i];
			}
			i++;
		}

		System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,j+1)));
	}
}


class RemoveDuplicatesWithIBM{
	public static void main(String[] args) {
		int[] arr={1,2,4,3,2,4,3,1,2,6,7};

		int n=arr.length;

		int[] temp=new int[n];
		int k=0;

		for(int i=0;i<n;i++){
			boolean found=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					found=true;
					break;
				}
			}
			if(!found){
				temp[k++]=arr[i];
			}
		}

		System.out.println(Arrays.toString(temp));
	}
}

class RemoveDupWithTW{
	public static void main(String[] args){
		int[] arr={1,3,2,1,1,3,4,6,7,5,3,2};
		int n=arr.length;

		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		int j=0;

		for(int i=1;i<n;i++){
			if(arr[i]!=arr[j]){
				j++;
				arr[j]=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,j+1)));

	}
}