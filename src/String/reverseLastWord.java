package String;

public class reverseLastWord {

    public static void main(String[] args){

        String input = "I love java programming";

        String[] word = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < word.length - 1; i++){

            sb.append(word[i]).append(" ");
        }

        String lastWord = word[word.length - 1];
        String reversedLastWord = new StringBuilder(lastWord).reverse().toString();

        sb.append(reversedLastWord);

        System.out.println("Reversed Last word of String :" + sb.toString());





    }
}
