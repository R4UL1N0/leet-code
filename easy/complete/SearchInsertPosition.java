package easy.complete;

public class SearchInsertPosition {
    
    static int solution(int[] nums, int target) {

        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};

        System.out.println(solution(numbers, 7));
    }
}
