import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr={10,5,3,1,3,5,1,9};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] selectionSort(int[] arr){

        int n=arr.length;

        for(int i=0;i<n;i++){
            int minValue=arr[i];
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<minValue){
                    minValue=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        return arr;
    }
}
