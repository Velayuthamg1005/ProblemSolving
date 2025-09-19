public class LeadersArray{
	public static void main(String[] args){
		int[] arr={16,17,4,3,5,16,2};
		int n=arr.length;
		int count=0;
		
		for(int i=0;i<n;i++){
			boolean isLeader=true;
			for(int j=i+1;j<n;j++){
				if(arr[i]<arr[j]){
					isLeader=false;
					break;
				}
			}
			if(isLeader){
				count++;
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println(count);
	}
}