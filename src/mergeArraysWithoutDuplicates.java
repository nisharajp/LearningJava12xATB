import java.util.LinkedHashSet;
import java.util.Set;

public class mergeArraysWithoutDuplicates {

    public static void main(String[] args){

        int[] arrays = {1, 2, 3, 4, 5};
        int[] arrays1 = {3, 4, 5, 6, 7};

        Set<Integer> ArrayResult = new LinkedHashSet<>();

        for(int array : arrays){
            ArrayResult.add(array);
        } for(int array1 : arrays1){
            ArrayResult.add(array1);
        }
        System.out.println("Merged Array Without Duplicate: " + ArrayResult);
    }
}
