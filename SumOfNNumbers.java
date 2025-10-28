public class SumOfNNumbers{
    public static void main(String[] args) {
        
        int n=10;

        System.out.println(findSum(n));
    }

    public static int findSum(int n){
        if(n==0){
            return 0;
        }

        return n+findSum(n-1);
    }
}

class SumOfNNumbers2{
    public static void main(String[] args) {
        int n=5;

        findSum(n,0);
    }

    public static void findSum(int n,int curr){
        if(n==0){
            System.out.println(curr);
            return;
        }

        findSum(n-1, curr+n);
    }
}