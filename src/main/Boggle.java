package main;

public class Boggle {

    public int M;
    public int N;
    public Dictionary dic;

    Boggle(Dictionary dic) {
        this.dic = dic;
    }

    boolean isWord(String str) {
        return dic.trie.exists(str);
    }

    void findWordsUtil(char boggle[][], boolean visited[][], int i,
                       int j, StringBuilder str) {
        visited[i][j] = true;
        str = str.append(boggle[i][j]);

        if (isWord(str.toString()))
            System.out.println(str);

        for (int row = i - 1; row <= i + 1 && row < M; row++)
            for (int col = j - 1; col <= j + 1 && col < N; col++)
                if (row >= 0 && col >= 0 && !visited[row][col])
                    findWordsUtil(boggle, visited, row, col, str);

        str.deleteCharAt(str.length() - 1);
        visited[i][j] = false;
    }

    public void findWords(char[][] boggle) {
        this.M = boggle.length;
        this.N = boggle[0].length;
        boolean visited[][] = new boolean[M][N];

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                findWordsUtil(boggle, visited, i, j, str);
    }
}
