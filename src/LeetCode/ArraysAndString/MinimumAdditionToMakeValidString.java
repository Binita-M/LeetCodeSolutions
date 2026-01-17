package LeetCode.ArraysAndString;

public class MinimumAdditionToMakeValidString {
    public int addMinimum(String word, String pattern) {
        int i=0, j=0, count=0;
        int m=pattern.length();

        while (i<word.length()) {
            if(word.charAt(i)==pattern.charAt(j)){
                i++;
            }else {
               count++;
            }
           j=(j+1) % m;
        }
        if (j!= 0) {
            count += (m-j);
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumAdditionToMakeValidString matmvs = new MinimumAdditionToMakeValidString();
        String word = "aabab";
        String pattern = "abc";

        int count = matmvs.addMinimum(word, pattern);
        System.out.println(count);
    }
}
