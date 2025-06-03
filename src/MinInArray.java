public class MinInArray {
    public static void main(String[] args){

        int[] ages = {25, 58, 62, 48, 98, 77, 55, 10};

        int min = ages[0];

        for(int i=1; i<ages.length; i++){
            if(ages[i] < min){
                min = ages[i];
            }
        }
        System.out.println("Minimum Number =" + min);
    }
}
