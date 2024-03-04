package easy.complete;
class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
	}

    static boolean isPalindrome(int x) {
        String stringNumber = Integer.toString(x);

        StringBuilder reverseStringBuilder = new StringBuilder();

        for (var i = stringNumber.length() - 1; i >= 0; i--) {
            reverseStringBuilder.append(stringNumber.charAt(i));
        }

        String reverseString = reverseStringBuilder.toString();

        System.out.println(stringNumber);
        System.out.println(reverseString);

        if (stringNumber.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}