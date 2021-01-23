import java.util.HashMap;

class Scrabble {
    String word;
    HashMap<Character, Integer> scoreOfLetter = new HashMap<Character, Integer>();
    {
        scoreOfLetter.put('A', 1);
        scoreOfLetter.put('E', 1);
        scoreOfLetter.put('I', 1);
        scoreOfLetter.put('O', 1);
        scoreOfLetter.put('U', 1);
        scoreOfLetter.put('L', 1);
        scoreOfLetter.put('N', 1);
        scoreOfLetter.put('R', 1);
        scoreOfLetter.put('S', 1);
        scoreOfLetter.put('T', 1);
        scoreOfLetter.put('D', 2);
        scoreOfLetter.put('G', 2);
        scoreOfLetter.put('B', 3);
        scoreOfLetter.put('C', 3);
        scoreOfLetter.put('M', 3);
        scoreOfLetter.put('P', 3);
        scoreOfLetter.put('F', 4);
        scoreOfLetter.put('H', 4);
        scoreOfLetter.put('V', 4);
        scoreOfLetter.put('W', 4);
        scoreOfLetter.put('Y', 4);
        scoreOfLetter.put('K', 5);
        scoreOfLetter.put('J', 8);
        scoreOfLetter.put('X', 8);
        scoreOfLetter.put('Q', 10);
        scoreOfLetter.put('Z', 10);
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;
        for(int i=0; i<word.length(); ++i){
            score += scoreOfLetter.get(word.charAt(i));
        }
        return score;
    }

}
