package main;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        Dictionary dict = new Dictionary();
        dict.buildDic();

        char boggle[][] = {{'M', 'W', 'E', 'N'},
                {'Q', 'X', 'L', 'E'},
                {'U', 'B', 'X', 'F'},
                {'F', 'I', 'Y', 'K'}};

        System.out.println("Following words of dictionary are present");
        new Boggle(dict).findWords(boggle);

        System.out.println(System.currentTimeMillis()-start);

    }
}
