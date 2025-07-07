import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 4, 1, 3, 2, 4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int element : elements){
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){

            System.out.println("Element : " + entry.getKey() + "Frequency : " + entry.getValue());
        }


    }
}
