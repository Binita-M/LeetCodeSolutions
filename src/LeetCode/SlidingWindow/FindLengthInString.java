package LeetCode.SlidingWindow;

public class FindLengthInString {
    public int findLength(String str) {
        int left = 0;
        int current = 0;
        int length = 0;

        for (int right=0; right<str.length(); right++) {
            if (str.charAt(right)=='0') {
                current++;
            }
            while(current>1){
                if(str.charAt(left)=='0'){
                    current--;
                }
                left++;
            }
          length = Math.max(length, right-left+1);
        }
        return length;
    }

    public static void main(String[] args) {
        FindLengthInString findLengthInString = new FindLengthInString();
       // String str = "011010111";
        String str = "011";

        int length = findLengthInString.findLength(str);
        System.out.println("The length of the longest window with only one 0 is: " + length);
    }
}
