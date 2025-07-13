package String;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

    public static void main(String[] args){

        String str = "silent";
        String str1 = "listen";

        System.out.println(areAnagrams(str, str1));
    }

    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false; //different lengths can't be anagram
            }
        Map<Character,Integer> WordsFreq = new HashMap<>();

        for(char ch: s1.toCharArray()){
            WordsFreq.put(ch, WordsFreq.getOrDefault(ch, 0) + 1);
        }
        for(char ch : s2.toCharArray()) {
            if (!WordsFreq.containsKey(ch)) {
                return false;
            }

            WordsFreq.put(ch, WordsFreq.get(ch) - 1);
            if (WordsFreq.get(ch) < 0) {
                return false;

            }
        }
        return true;








    }
}
