import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        
        int[] arr={6,4,2,7,8,1,0,8};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] insertionSort(int[] arr){

        int n=arr.length;

        for(int i=1;i<n;i++){

            int temp=arr[i];
            int j=i-1;

            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=temp;
        }

        return arr;
    }
}
