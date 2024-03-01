public class TwoSum {
    static public int[] twoSum(int[] nums, int target) throws Exception {

        for (var i = 0; i < nums.length; i++) {
            var firstNum = nums[i];

            for (var j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                
                var secondNum = nums[j];

                int sum = firstNum + secondNum;

                if (sum == target) {
                    System.out.println("Result: { " + firstNum + " " + secondNum + " }");
                    int[] result = {firstNum, secondNum};
                    return result;
                } else {
                    continue;
                }
            }
        }

        // int[] array = {0};

        // return array;

        throw new Exception("No way to reach target");
    }

    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 7, 6};
        System.out.println(twoSum(array, 9));
    }
}
