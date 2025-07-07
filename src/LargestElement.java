public class LargestElement {

    public static void main(String[] args){

        int[] Elements = {25, 52, 46, 85, 79, 73, 95,94};

        int LargestElement = Elements[0];

        for(int Element : Elements){
            if(Element > LargestElement){
                LargestElement = Element;
            }
        }
        System.out.println("Largest Element : " + LargestElement);
    }

}