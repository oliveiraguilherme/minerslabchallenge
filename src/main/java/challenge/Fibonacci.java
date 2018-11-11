package challenge;

import challenge.exception.InvalidFibonacciInputException;

import java.util.Scanner;

class Fibonacci {

    static long calculate(int n) throws InvalidFibonacciInputException {
        if (n < 0) {
            throw new InvalidFibonacciInputException();
        }
        long enesimo;
        enesimo = Fibonacci.fibo(n);
        return enesimo;

    }
    //metodo recurso do mano fibo
    static long fibo(int n){

        if (n == 0 ){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n -2);
    }
}
