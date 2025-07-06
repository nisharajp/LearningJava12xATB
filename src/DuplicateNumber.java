import java.util.HashSet;

public class DuplicateNumber {

    public static void main(String[] args){

        int[] nums = {2, 8, 9, 5, 2, 4, 5};

        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate Number =");

        for(int num : nums){
            if(!seen.add(num)){

                System.out.println(num);
            }
        }

    }
}
