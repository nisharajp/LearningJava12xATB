public class WordCount {
    public static void main(String[]args){

        String str = "Hello this is a java program";

        String[] words = str.trim().split("\\s+");

        System.out.println("Word Count =" + words.length);
    }
}
