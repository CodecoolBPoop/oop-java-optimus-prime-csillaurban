package com.codecool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeFounderOne {
    private int n;

    PrimeFounderOne(int n) {
        this.n = n;
    }

    private Boolean[] createSievingList() {
        Boolean[] sievingList = new Boolean[this.n + 1];
        for (int i = 0; i < sievingList.length; i++) {
            sievingList[i] = true;
        }
        return sievingList;
    }

    public List findPrimes() {
        Boolean[] sievingList = createSievingList();
        List<Integer> primes = new ArrayList<>();

        for (int prime = 2; prime * prime < sievingList.length; prime++) {
            if(sievingList[prime] == true) {
                for (int i = prime * prime; i < sievingList.length; i+=prime) {
                    sievingList[i] = false;
                }
            }
        }

        for (int i = 2; i < sievingList.length; i++) {
            if(sievingList[i] == true) {
                primes.add(i);
            }
        }

        return primes;
    }

    public int countNumOfPrimes(List primes) {
        return primes.size();
    }


}
