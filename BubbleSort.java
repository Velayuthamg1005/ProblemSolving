import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={9, 4, 1, 7, 3};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubbleSort(int[] arr){
        
        int n=arr.length;
        boolean swapped=false;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }

        return arr;
    }

}
