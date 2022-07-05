package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        DuplicatesWords();
    }

    public static void DuplicatesWords(){

        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Laptop",
                "Dog", "Cat", "Java",
                "Java", "Kent", "Coffee",
                "Dog", "Beta", "Laptop",
                "Cat", "Java", "Java", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
}