import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        
        int[] arr={4,5,2,1,4,6,8,5,0};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int start,int end){

        if(end-start==1){
            return;
        }

        int mid=(start+end)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        mergeArray(arr,start,mid,end);
    }

    public static void mergeArray(int[] arr,int start,int mid,int end){

        int n=arr.length;
        int[] result=new int[n];

        int i=start;
        int j=mid;
        int k=start;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                result[k++]=arr[i++];
            }
            else{
                result[k++]=arr[j++];
            }
        }

        while(i<mid){
            result[k++]=arr[i++];
        }

        while(j<end){
            result[k++]=arr[j++];
        }

        for(int itr=start;itr<end;itr++){
            arr[itr]=result[itr];
        }
    }
}