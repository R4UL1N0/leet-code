package easy.complete;

import java.util.HashMap;
import java.util.Map;

public class AddBinary_Heavy {
    
    static String solution(String a, String b) throws Exception {

        Map<Integer, String> mapSum = new HashMap<>();
        mapSum.put(0, "0");
        mapSum.put(1, "1");
        mapSum.put(2, "0");
        mapSum.put(3, "1");

        boolean carrying = false;

        String binaryString = "";
        boolean running = true;
        int index = 1;

        while (running) {

            int aValue = Integer.parseInt(Character.toString(a.charAt(a.length() - index)));
            int bValue = Integer.parseInt(Character.toString(b.charAt(b.length() - index)));

            int result = aValue + bValue;

            if (carrying) {
                result++;
                carrying = false;
            } 
            
            if (result == 2 || result == 3) {
                carrying = true;
            }

            binaryString = mapSum.get(result) + binaryString;

            index++;

            if (index > a.length() || index > b.length()) {
                running = false;
            }
            
        }

        int lengthDiff = Math.abs(a.length() - b.length());

        if (lengthDiff != 0) {
            System.out.println("true");
            String remainingBinary = (a.length() - b.length()) < 0 ? b : a;

            for (var i = lengthDiff - 1; i >= 0; i--) {
                System.out.println("loop");
                int value = Integer.parseInt(Character.toString(remainingBinary.charAt(i)));

                if (carrying) {
                    value++;
                    carrying = false;
                }

                if (value == 2 || value == 3) {
                    carrying = true;
                }

                System.out.println(mapSum.get(value));
                binaryString = mapSum.get(value) + binaryString;
            }
        }

        if (carrying) {
            binaryString = "1" + binaryString;
        }

        return binaryString;
        
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution("11", "1"));
    }
}
