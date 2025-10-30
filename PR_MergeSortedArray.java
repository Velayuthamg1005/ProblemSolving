import java.util.Arrays;

public class PR_MergeSortedArray {
    public static void main(String[] args) {
        
        int[] arr1={1,3,5,6};
        int[] arr2={2,5,6,7,8};

        int[] result=mergeSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortedArray(int[] arr1,int[] arr2){

        int[] mergeArray=new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergeArray[k++]=arr1[i++];
            }
            else{
                mergeArray[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            mergeArray[k++]=arr1[i++];
        }

        while(j<arr2.length){
            mergeArray[k++]=arr2[j++];
        }

        return mergeArray;
    }
}
