package edu.canisius.csc.lsp.exam3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit ipsum";

        Map<String, Integer> wordCounts = new HashMap<>();

        String[] words = text.split(" ");

        int iteration = 0;
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            drawHashMap(iteration, wordCounts);
            iteration++;
        }
    }

    private static void drawHashMap(int iteration, Map<String, Integer> map) {
        System.out.println("Word Frequency Map for iteration " + iteration + ":");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("------------------------");
    }
}
