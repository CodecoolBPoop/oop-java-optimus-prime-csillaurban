package com.codecool;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    PrimeFounderOne pFOne = new PrimeFounderOne(11);
	    List<Integer> primes = pFOne.findPrimes();
        System.out.println("Number of primes: " + pFOne.countNumOfPrimes(primes));

    }
}
