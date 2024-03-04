package easy.complete;

public class PlusOne {
 
    static int[] solution(int[] digits) {

        for (var i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } 

            digits[i] = 0;

            if (i == 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        
        for (int n: digits) {
            System.out.println(n);
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 8, 9};

        System.out.println(solution(digits));
    }
}
