package easy.complete;
public class NeedleWorkInHaystack {

    public static int wordInHaystack(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        int currentNeedleIndex = 0;

        for (var i = 0; i < haystack.length(); i++) { 
            for (var j = i; j < haystack.length(); j++) {
                if (haystack.charAt(j) == needle.charAt(currentNeedleIndex)) {
                    currentNeedleIndex++;
                } else {
                    currentNeedleIndex = 0;
                    break;
                }

                if (currentNeedleIndex == needle.length()) return j - currentNeedleIndex + 1;
            }
            
        }

        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(wordInHaystack("leetcode", "leeto"));
    }
}
