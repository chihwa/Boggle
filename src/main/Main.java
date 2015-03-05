package main;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        Dictionary dict = new Dictionary();
        dict.buildDic();

        char boggle[][] = {{'U', 'P', 'I', 'L'},
                {'J', 'J', 'A', 'I'},
                {'M', 'M', 'F', 'L'},
                {'F', 'N', 'L', 'B'}};

        System.out.println("Following words of dictionary are present");
        new Boggle(dict).findWords(boggle);

        System.out.println(System.currentTimeMillis() - start);

    }
}
