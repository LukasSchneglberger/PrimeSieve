package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EratosthenesPrimeSieve implements  PrimeSieve{
    private int max;

    public EratosthenesPrimeSieve(int max){
        this.max = max;

    }

    @Override
    public boolean isPrime(int a) {
        boolean prime[] = new boolean[max+1];
        for(int i=0;i<=max;i++)
            prime[i] = true;

        for(int p = 2; p*p <=max; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= max; i += p)
                    prime[i] = false;
            }
            return prime[a];
        }


    return true;
    }

    @Override
    public void printPrimes() {

        for (int i = 1; i < max; i++){
            System.out.println(i + " : " + isPrime(i));
        }


    }

    public static void main(String[] args) {
    EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(10);
        eps.printPrimes();
    }

}
