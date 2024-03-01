import java.util.HashMap;

class RomanNumberToInt {
    static boolean isRomanNumberValid(String romanNumber) {
        String romanNumeralRegex = "^(M{0,3})(D?C{0,3}|CD|CM)(L?X{0,3}|XL|XC)(V?I{0,3}|IV|IX)$";

        if (romanNumber.matches(romanNumeralRegex)) {
            return true;
        } 

        return false;

    }

    static public int romanToInt(String s) {
        int sum = 0;
        int currentValue = 0;
        int prevValue = 0;

        for (var i = s.length() - 1; i >= 0; i--) {
            currentValue = simpleRomanToInt(s.charAt(i));

            if (prevValue > currentValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }

    static private int simpleRomanToInt(char s) {
        switch (s) {
            case 'I': return  1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }

    static int romanToIntHashMap(String romanNumber) {

        if (!isRomanNumberValid(romanNumber)) {
            System.out.println("Not roman");
            return 0;
        }

        HashMap<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int sum = 0;
        int prevNum = 0;

        for (var i = 0; i < romanNumber.length(); i++) {

            int currentNumber = romanValues.get(romanNumber.charAt(i));
            
            if (currentNumber > prevNum) {
                sum += currentNumber - prevNum - prevNum;
            } else {
                sum += currentNumber;
            }

            prevNum = currentNumber;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
