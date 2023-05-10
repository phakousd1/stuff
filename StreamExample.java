package edu.canisius.csc.lsp.exam3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //list "numbers" of the integers listed.
        numbers.stream() // CREATE a stream for the variable numbers which is a list.
                .filter(n -> n % 2 == 0) // Intermediate operation: filter even numbers
                .map(n -> n * 2) // Intermediate operation: maps the number to n * 2
                .forEach(System.out::println); // Terminal operation: print each number

        // Output: 4, 8, 12, 16, 20

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        numbers2.stream().forEach(num -> {
            int squared = num * num;
            System.out.println(num + " squared is " + squared);
        });

        int n = 10, t1 =0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (n > 0) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;// first two fibonacci sequences are 0, 1 (t1/t2)
            t1 = t2;
            t2 = sum; //iterate over first n fibonacci
            n--;
        }
         List<String> uniqueWords = Arrays.asList("\n" +"Bubble", "Tea", "Chocolate");
         Iterator var7 = uniqueWords.iterator();

            while(var7.hasNext()) {
                String word = (String) var7.next();
                System.out.println(word);
            }
    }
}
