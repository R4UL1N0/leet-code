package easy;
public class LengthLastWord {
    
    public static int lengthLastWord(String s) {
        s = s.trim();
        String[] wordList = s.split(" ");

        for (String word: wordList) {
            System.out.println(word);
        }

        return wordList[wordList.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthLastWord("   fly me   to   the moon  "));
    }
}
