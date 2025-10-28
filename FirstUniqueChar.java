import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str="LeetCode";
        boolean have;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            have=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    have=true;
                    break;
                }
            }
            if(!have){
                System.out.println(i);
                break;
            }
        }
    }
}


class Solution2{
    public static void main(String[] args) {
       String str="loveleetcode";

        int[] freq=new int[256];

        for(char ch:str.toCharArray()){
            freq[ch]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[str.charAt(i)]==1){
                System.out.println(i);
                break;
            }
        }
    }
}


class Solution3{
    public static void main(String[] args) {
        String s="aabb";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<map.size();i++){
            if(map.get(s.charAt(i))==1){
                System.out.println(i);
            }
        }
        System.out.println("-1");
    }
}