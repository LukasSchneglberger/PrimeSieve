package com.company;

public class EratosthenesPrimeSieve implements  PrimeSieve{
    private int max;

    public EratosthenesPrimeSieve(int max){
        this.max = max;

    }

    @Override
    public void isPrime() {
        boolean prime[] = new boolean[max + 1];
        for(int i = 0; i <= max; i++)
            prime[i] = true;

        for(int p = 2; p * p <= max; p++) {
            if(prime[p] == true){
                for(int i = p * p; i <= max; i += p)
                    prime[i] = false;
            }
            
        }


        printPrimes(prime);
    }





    @Override
    public void printPrimes(boolean[] arr) {

        for(int i = 2; i <= max; i++)
        {
            if(arr[i] == true)
                System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {
    EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(100);
        eps.isPrime();
    }

}
