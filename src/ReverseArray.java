public class ReverseArray {

    public static void main(String[] args){

       int[] numbers = {1, 2, 3, 4, 5};

       System.out.println("Reversed Array :");

       for(int i = numbers.length - 1; i>=0; i--){

           System.out.println(numbers[i] + " ");


        }
    }
}
