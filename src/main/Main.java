package main;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Dictionary dict = new Dictionary();
        dict.buildDic();

        char boggle[][] = {{'G', 'I', 'Z'},
                {'U', 'E', 'K'},
                {'Q', 'S', 'E'}};

        System.out.println("Following words of dictionary are present");
        new Boggle(dict).findWords(boggle);
    }
}
