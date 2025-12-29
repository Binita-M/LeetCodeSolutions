package LeetCode.SlidingWindow;

public class FindLength {
    public int findLengthSlidingWindow (int[] array, int constraintVariable) {
        int left = 0;
        int currentSum = 0;
        int length = 0;

        for (int right = 0; right < array.length; right++) {
            currentSum += array[right];
            if (currentSum > constraintVariable) {
                currentSum -= array[left];
                left++;
            }
            length = Math.max(length, right-left+1);
        }
        return length;
    }

    public static void main(String[] args) {
        FindLength findLength = new FindLength();
        int[] array = {5,4,3,4,2,1,1,6};
        int k = 8;

        int length = findLength.findLengthSlidingWindow(array, k);
        System.out.println("Length of the window is: " + length);

    }
}
