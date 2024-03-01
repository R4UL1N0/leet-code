public class RemoveElement {
    //  SHOULD REFACTOR TO J-- IDEIA
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (var i = 0; i < (nums.length - count); i++) {

            if (nums[i] == val && nums.length == 1) return 0;
             
            while (nums[i] == val) {

                if (i > nums.length - 1 - count) {
                    return nums.length - count;
                }

                int temp = nums[nums.length - 1 - count];
                nums[nums.length - 1 - count] = nums[i];
                nums[i] = temp; 
                count++;
            }
        }

        for(int n: nums) {
            System.out.println(n);
        }

        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] n = {3,3, 3};
        System.out.println(removeElement(n, 3));;
    }
}
