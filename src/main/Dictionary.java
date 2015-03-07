package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    public static final String DICTIONARY = ".\\src\\main\\resources\\words.dic";
    public Trie trie = new Trie();

    public void buildDic() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(DICTIONARY));

        String word;
        while ((word = br.readLine()) != null) {
            word = word.trim();
            trie.insertString(word.toUpperCase());
        }
    }


}
