import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {
    
    static public boolean isValid(String s) {

        return notRecursive(s, 0);
    }

    static private boolean recursive(String s, int startIndex) {
        System.out.println(s);

        // if (startIndex - 1 < 0 && s.length() < 2) return false;

        for (var i = 0; i < s.length(); i++) {
            
            switch(s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    break;
                
                case ')':
                    if (i - 1 < 0) return false;
                    if (s.charAt(i - 1) == '(') {
                        var substring = s.substring(0, i - 1) + s.substring(i + 1);
                        return recursive(substring, i - 1);
                    } else {
                        return false;
                    }
                case ']':
                    if (i - 1 < 0) return false;
                    if (s.charAt(i - 1) == '[') {
                        var substring = s.substring(0, i - 1) + s.substring(i + 1);
                        return recursive(substring, i - 1);
                    } else {
                        return false;
                    }
                case '}':
                    if (i - 1 < 0) return false;
                    if (s.charAt(i - 1) == '{') {
                        var substring = s.substring(0, i - 1) + s.substring(i + 1);
                        return recursive(substring, i - 1);
                    } else {
                        return false;
                    }
                default: 
                    return false;
            }
        }

        return s.isEmpty();
    }

    static private boolean notRecursive(String s, int startIndex) {
        var substring = s;
        var index = 0;
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        while (!substring.isEmpty()) {
            System.out.println(index);
            if (index >= substring.length()) return false;
            if (substring.length() == 1) return false;

            System.out.println(substring);
            char c = substring.charAt(index);
            if (c == '(' || c == '[' || c == '{') {
                if (index + 1 == substring.length()) return false;
                index++;
                continue;
            }
            if (c == ')' || c == ']' || c == '}') {
                if (index - 1 < 0) return false;
                if (substring.charAt(index - 1) != map.get(c)) return false;

                if (index - 1 < 0) {
                    return false;
                } else {
                    substring = substring.substring(0, index - 1) + substring.substring(index + 1);
                    index--;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[[[[[]]]]]"));
    }
}
