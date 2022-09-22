package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EratosthenesPrimeSieve implements  PrimeSieve{


    @Override
    public boolean isPrime(int p) {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(p)
                .collect(Collectors.toList());

        Integer[] numArr = new Integer[numbers.size()];
        numArr = numbers.toArray(numArr);

        return true;

    }

    @Override
    public void printPrimes(int max) {

    }

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve();
        Scanner s = new Scanner(System.in);
        System.out.println("Obergrenze eingeben");
        int max = s.nextInt();
        eps.printPrimes(max);
    }

}
