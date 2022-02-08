package DynamicProgramming.Fibonacci;

import java.util.HashMap;

public class Solution {
    
    HashMap<Integer, Long> fibonacciMap =  new HashMap<>();
    long fibonacci(int n){

        if(fibonacciMap.containsKey(n)){
            return fibonacciMap.get(n);
        }

        if (n<=2) {
            return 1;
        }

        long result = fibonacci(n-1) + fibonacci(n-2);
        fibonacciMap.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Solution oSolution = new Solution();
        System.out.println(oSolution.fibonacci(50));
    }
}
