package String;

public class PalindromeCheck {

    public static void main(String[] args){

        String str = "madam";

        String reverseString = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseString)){

            System.out.println(str + " is palindrome");
        } else{

            System.out.println(str + " is not palindrome");
        }


    }
}
