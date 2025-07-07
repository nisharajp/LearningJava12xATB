public class SmallestElement {

    public static void main(String[] args){

        int[] Elements = {23, 12, 9, 46, 85, 97, 15};

        int SmallestElement = Elements[0];

        for(int Element : Elements){
            if(Element < SmallestElement){
                SmallestElement = Element;
            }
        }
        System.out.println("SmallestElement : " + SmallestElement);
    }
}
