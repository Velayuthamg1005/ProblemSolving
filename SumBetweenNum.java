public class SumBetweenNum {
    public static void main(String[] args) {
        int n=3;
        int m=6;

        System.out.println(findBetween(n,m));
    }

    public static int findBetween(int n,int m){

        if(n>m){
            return 0;
        }

        return n+findBetween(n+1, m);
    }
}
