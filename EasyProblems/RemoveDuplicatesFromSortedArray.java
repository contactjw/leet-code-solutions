package EasyProblems;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] numArray = {-3, -1, 0, 0, 0, 3, 3};

        int newSize = removeDuplicates(numArray);

        System.out.println("Array without duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(numArray[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;

        if (length == 0)
            return 0;

        int i;
        int targetIndex = 1;
        int first = nums[0];

        for (i = 1; i < length; i++) {
            if (nums[i] != first) {
                first = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
