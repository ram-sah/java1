
public class BinarySearch {

    public static void main(String[] args) {
        // int nums[] = new int[100];
        int nums[] = {2, 3, 4, 5, 6, 7, 8};
        int target = 8;
        int result = linearNum(nums, target);
        int result1 = binaryNum(nums, target);
        int result2 = recursiveNum(nums, target, 0, nums.length - 1);
        if (result != -1) {
            System.out.println("linear search index found at index: " + result);
            System.out.println("Binary search index found at index: " + result1);
            System.out.println("recursive search index found at index: " + result2);
        } else {
            System.out.println("Not found linear: " + result);
            System.out.println("Not found binary: " + result1);
            System.out.println("Not found recursive: " + result2);
        }
    }

    //1. linear search method
    public static int linearNum(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (nums[i] == target) {
                System.out.println("Linear times count: " + count);
                return i;
            }
        }
        System.out.println("Linear count: " + count);
        return -1;
    }

    // 2. binary search method
    public static int binaryNum(int[] nums, int target) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Binary times count: " + count);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Binary times count: " + count);
        return -1;
    }

    // 3. recursive search method
    public static int recursiveNum(int[] nums, int target, int left, int right) {
        int count = 0;
        if (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Recursive times count: " + count);
                return mid;
            } else if (nums[mid] < target) {
                System.out.println("Recursive times count: " + count);
                return recursiveNum(nums, target, mid + 1, right);
            } else {
                System.out.println("Recursive times count: " + count);
                return recursiveNum(nums, target, left, mid - 1);
            }
        }
        return -1;
    }

}


//https://www.youtube.com/watch?v=4_HOnhB64Dg&t=29s
