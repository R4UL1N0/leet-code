package easy.complete;
public class LongestCommonPrefix {

    static public String solution(String[] words) {
        String prefix = "";
        var baseWord = words[0];

        if (words.length == 1) {
            return words[0];
        }

        for (var i = 1; i <= baseWord.length(); i++) {
            var baseWordSubstring = baseWord.substring(0, i);
            for(var j = 1; j < words.length; j++) {
                var currentWord = words[j];
                

                if (currentWord.length() < baseWordSubstring.length()) {
                    return prefix;
                }

                var currentWordSubstring = currentWord.substring(0, i);
                System.out.println(baseWordSubstring + " " + currentWordSubstring);

                if (!baseWordSubstring.equals(currentWordSubstring)) {
                    return prefix;
                }
            }

            prefix =  baseWordSubstring;
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"flower","flowe"};

        
        System.out.println(solution(array));
    }
}
