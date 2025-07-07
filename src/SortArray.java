import java.util.Arrays;

public class SortArray {

    public static void main(String[] args){

        int[] numbers = {58, 12, 4, 36, 78};

        Arrays.sort(numbers);

        System.out.println("Sorted Array : ");

        for(int number : numbers){

            System.out.println(number + " ");
        }
    }
}
