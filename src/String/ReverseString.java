package String;

public class ReverseString {

    public static void main(String[]args){

        String str = "Hello World!";

//        String reverseString = new StringBuilder(str).reverse().toString();
//
//        System.out.println(reverseString);


//        With using forloop

        for(int i = str.length() - 1; i>=0; i--){

            System.out.print(str.charAt(i));
        }
    }
}
