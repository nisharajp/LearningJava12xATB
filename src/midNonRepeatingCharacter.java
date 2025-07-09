import java.util.*;

public class midNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "switchas switches que testing".replaceAll("\\s+", "");

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

            List<Character> nonRepeats = new LinkedList<>();

            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

                if (entry.getValue() == 1) {

                    nonRepeats.add(entry.getKey());
                }
            }
                if (!nonRepeats.isEmpty()) {
                    int mid = nonRepeats.size() / 2;

                    System.out.println("Middle Non-Repeating Character :" + nonRepeats.get(mid));
                } else {
                    System.out.println("Non-Repeating Character Not Found!!");

                }


            }
        }



