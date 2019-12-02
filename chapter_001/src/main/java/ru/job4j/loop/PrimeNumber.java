package ru.job4j.loop;

import java.util.BitSet;
import java.util.LinkedList;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        LinkedList<Integer> primes = new LinkedList<Integer>();
        BitSet nonPrimes = new BitSet(finish + 1);

        for (int p = 2; p <= finish; p = nonPrimes.nextClearBit(p + 1)) {
            for (int i = p * p; i <= finish; i += p)
                nonPrimes.set(i);
            primes.add(p);
        }
        return primes.size();
    }
}