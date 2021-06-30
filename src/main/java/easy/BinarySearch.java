package easy;

public class BinarySearch {

    public static void main(String[] args) {
        int search = search(new int[]{5}, 5);
        System.out.println("search = " + search);
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
