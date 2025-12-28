package LeetCode.TwoPointer;

public class CheckSubsequences {
    public boolean isSubsequence(String s1, String s2) {
        int i=0, j=0;

        while (i<s1.length() && j<s2.length()) {
            if (s1.charAt(i)== s2.charAt(j)) {
                i++;
            }
            j++;
        }
    return i==s1.length();
    }

    public static void main(String[] args) {
        CheckSubsequences checkSubsequences = new CheckSubsequences();
        String s1 = "ade";
        String s2 = "abccde";

        boolean result = checkSubsequences.isSubsequence(s1, s2);
        System.out.println(result);
    }
}
