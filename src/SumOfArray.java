public class SumOfArray {

    public static void main(String[] args){

        int[] numbers = { 12, 58, 64, 79};
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum of all the elements : " + sum);
    }
}
