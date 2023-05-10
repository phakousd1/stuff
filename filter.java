package edu.canisius.csc.lsp.exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        List<String> words;
        words = new ArrayList(Arrays.asList("apple", "banana", "cherry", "durian", "elderberry", "fig",
                "grapefruit"));
        Stream<String> longWordsStream = words.stream()
                //filtering out the words from list `words` and making a stream called longWordsStream
                .filter(word -> word.length() > 6); //will only have grapefruit and elderberry

        words.remove(6); //goes back the words list again not longWordsStream
        //removes the 7th element in the `words` list "grapefruit" because that's index 6

        List<String> longWordsList = longWordsStream.collect(Collectors.toList());
        // using the collect method which is a teriminal operation on streams
        // allows you to collect the elements of a stream into a collection
        // it is a list of the current "words" list that was changed into a stream (longWordsStream)
        // it prints out the current value after filtering out the words of more than 6 and then
        // removing the word in index 6 (7th element because it starts at index 0 in Java).
        System.out.println(longWordsList);

    }
}
