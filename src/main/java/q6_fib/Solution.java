package q6_fib;

public class Solution {

    public int fib(int n) {
        if(n == 1){
        return 1;
        }else if(n==2){
            return 1;
        }else{
            return fib(n-2)+fib(n-1);
        }
    }
}
