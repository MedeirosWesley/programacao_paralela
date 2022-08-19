import static java.lang.Math.sqrt;

public class Prime {
    private int n;
    public Prime(int n){
        this.n= n;
    }
    public void run(){
        boolean isPrime = false;
        int end = n - 1000;
        while (n == end){
            for(int i = n ; n>= sqrt(n) ; i--){
                if(n % i == 0){
                    break;
                }
            }
            n--;
        }


    }
}
