package noman.love.java.chapter5.examples;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i <= nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
