import java.util.*;


class FindingFreqInString{
    public static void main(String[] args){
        String str="Velayutham.G";

        int[] freq=new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            freq[ch]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i+" -> "+freq[i]);
            }
        }
    }
}

class FindingFreqInNumber{
    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,5,5,6,6};
        int n=arr.length;

        boolean[]  visited=new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }

            System.out.println(arr[i]+" -> "+count);
        }

    }
}

class FindingFreqHashMap{
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,6,7,2,1,1,1,1,3};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr){
            map.put(a,map.getOrDefault(a, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

class FindingFreqCharHashMap{
    public static void main(String[] args) {
        String str="Velayutham.G";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}