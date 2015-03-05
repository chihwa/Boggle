package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    public static final String DICTIONARY = ".\\src\\main\\resources\\en_US.dic";
    public Trie trie = new Trie();

    public void buildDic() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(DICTIONARY));

        String s;
        int wordNum = Integer.valueOf(br.readLine());
        for (int i = 0; i < wordNum; i++) {
            s = br.readLine();
            String word = s.split("/")[0];
            trie.insertString(word.toUpperCase());
        }
    }


}
