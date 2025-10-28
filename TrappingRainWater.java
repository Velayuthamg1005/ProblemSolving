import java.util.*;

public class TrappingRainWater{

    public static int trappedRain(int[] arr){
        int n=arr.length;

        int[] left=new int[n];
        int[] right=new int[n];

        int max=-1;

        for(int i=0;i<n;i++){
            int curr=arr[i];

            if(curr>max){
                max=curr;
            }

            left[i]=max;
        }
        
        max=-1;

        for(int i=n-1;i>=0;i--){
            int curr=arr[i];

            if(curr>max){
                max=curr;
            }

            right[i]=max;
        }

        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.min(left[i],right[i])-arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("Result: "+trappedRain(arr));
    }
}