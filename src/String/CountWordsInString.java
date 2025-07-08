package String;

public class CountWordsInString {

    public static void main(String[] args){

        String str = "Hello World!, Welcome to the Java.";

        String[] words = str.split("\\s+");

        System.out.println("String Word Count:" + words.length);
    }
}
