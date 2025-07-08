package String;

public class RemoveWhiteSpace {

    public static void main(String[] args){

        String str = "Hello world";

        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
