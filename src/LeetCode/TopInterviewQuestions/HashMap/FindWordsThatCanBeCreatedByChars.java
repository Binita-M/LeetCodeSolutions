package LeetCode.TopInterviewQuestions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeCreatedByChars {
    public int countCharacters(String[] words, String chars) {
        int length = 0;

        //building frequency map for chars
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        //iterate over each word  and build frequency map for each word
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c,0));
            }
            boolean canBeFormed = true;

            //retrieve key and value from the wordmap
            for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();

                //if wordMap contains enough characters to build chars
                if (!charMap.containsKey(c) || charMap.get(c) < count){
                    canBeFormed = false;
                    break;

                }
            }
            if (canBeFormed) {
                length += word.length();
            }
        }
        return length;
        }
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        FindWordsThatCanBeCreatedByChars fwtcbcbc =  new FindWordsThatCanBeCreatedByChars();
        int result = fwtcbcbc.countCharacters(words, chars);

        System.out.println(result); // output=6
    }
    }
