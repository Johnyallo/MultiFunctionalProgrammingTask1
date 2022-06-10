package Vocabulary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vocabulary {
    public static void main(String[] args) {
        String text = "kala, haru, Poponsha, jheLDrioma, toNAli, de, MOootro, xioxa, kala, HARU";

        //deterministic function
        String newText = text.toLowerCase().replaceAll(",", "");

        //clean function
        String [] words = newText.split(" ");
        //words.

        //using monada
        List<String> vocabulary = Arrays.stream(words)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(vocabulary);
    }
}
