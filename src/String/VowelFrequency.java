package String;

import java.util.*;

public class VowelFrequency {
    public static void main(String[] args){

        String str = "I love my Country".toLowerCase();

        Map<Character, Integer> VowelFreq = new LinkedHashMap<>();

        for(char vowel : "aeiou".toCharArray()){
            VowelFreq.put(vowel, 0);

        }
        for(char ch : str.toCharArray()) {
            if (VowelFreq.containsKey(ch)) {
                VowelFreq.put(ch, VowelFreq.get(ch) + 1);
            }
        }
            for(Map.Entry<Character, Integer> entry : VowelFreq.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }

