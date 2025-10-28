public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    public static int findFactorial(int n){
    
        if(n==0 || n==1){
            return 1;
        }

        else{
            return n*findFactorial(n-1);
        }
    }

}


class Factorial2{
    public static void main(String[] args) {
        int n=5;

        int fact=1;

        for(int i=n;i>=1;i--){
            fact=fact*i;
        }

        System.out.println(fact);
    }
}
