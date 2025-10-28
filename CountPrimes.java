public class CountPrimes{
    public static void main(String[] args){
        int n=10;
        System.out.println("Result: "+countPrime(n));
    }

    public static int countPrime(int n){

        if(n<=2){
            return 0;
        }

        int limit=(int)Math.sqrt(n);

        boolean[] composites=new boolean[n];

        for(int i=2;i<=limit;i++){
            if(composites[i]==false){
                for(int j=i*i;j<n;j+=i){
                    composites[j]=true;
                }
            } 
        }

        int count=0;

        for(int i=2;i<n;i++){
            if(composites[i]==false){
                count++;
            }
        }
        return count;
    }
}