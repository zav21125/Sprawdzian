package oop;

import java.util.HashMap;
import java.util.Map;

public class Collections4c {
    static Map<Integer, String> slownik = new HashMap<>();
    public static void main(String[] args) {

        slownik.put(1, "Ala");
        slownik.put(2, "ma");
        slownik.put(3, "kota");
        slownik.put(4, "i");
        slownik.put(5, "psa");

        for (int i = 1; i<= slownik.size() ; i++) {
            System.out.println("Element slownika: " + slownik.get(i));
        }

        slownik.put(1, "Adam");
        slownik.put(6, "As to kot Ali");

        for(int i = 1; i <= slownik.size() ; i++) {
            System.out.println("Element slownika: " + slownik.get(i));

        }
    }
}


