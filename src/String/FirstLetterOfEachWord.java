package String;

public class FirstLetterOfEachWord {

    public static void main(String[] args){

        String str = "Hello World, Welcome To Java!";

        StringBuilder firstLetter = new StringBuilder();

        for(String word : str.split("\\s+")){
            firstLetter.append(word.charAt(0));
        }
        System.out.println("First letter of each word: " + firstLetter.toString());
    }
}
