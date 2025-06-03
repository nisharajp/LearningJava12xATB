public class MaxInArray {
    public static void main(String[] args){

        int[] marks = {95, 25, 63, 58, 28, 45, 75};
        int max = marks[0];

        for(int i=1; i<marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
            }
        }
        System.out.println("Maximum Number =" + max);
    }
}
