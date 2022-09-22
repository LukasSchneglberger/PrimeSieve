package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EratosthenesPrimeSieve implements  PrimeSieve{


    @Override
    public boolean isPrime(int p) {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(p)
                .collect(Collectors.toList());

        for(int n : numbers){

        }
    }

    @Override
    public void printPrimes() {
        
    }

}
