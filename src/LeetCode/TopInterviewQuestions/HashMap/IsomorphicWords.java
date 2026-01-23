package LeetCode.TopInterviewQuestions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicWords {
    public boolean isIsomorph (String s, String t) {
        if (s.length() != t.length()) { //edge case: both strings must be of same length
            return false;
        }

        Map<Character, Character> stMap = new HashMap<>(); //for mapping s to t
        Map<Character, Character> tsMap = new HashMap<>(); //for mapping t to s

        //iterate over both strings to find out char at position i
        for (int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //checks mapping from s to t
            if(stMap.containsKey(c1)) {
                if(stMap.get(c1) != c2) {  // if chars are mapped before, it must map to the same char
                    return false;
                }
            } else {
                stMap.put(c1,c2); //if the char is seen for the first time, create st mapping
            }

            //checks reverse mapping
            if (tsMap.containsKey(c2)) {
                if (tsMap.get(c2) != c1) {  //if chars mapped before, it must map to same char
                    return false;
                }
            } else {
                tsMap.put(c2,c1); //if the char is seen for the first time, create reverse mapping
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*String s = "egg";
        String t = "add";*/

        String s = "foo";
        String t = "bar";

        IsomorphicWords imw = new IsomorphicWords();
        boolean result = imw.isIsomorph(s, t);

        System.out.println(result);

    }
}
