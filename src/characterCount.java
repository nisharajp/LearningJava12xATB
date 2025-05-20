public class characterCount {
    public static void main(String[] args) {

        String str = "Welcome To Automation";

        int upperCaseCount= 0;
        int lowerCaseCount= 0;

        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)) {
                upperCaseCount++;
            }
                else if(Character.isUpperCase(ch)){
                    lowerCaseCount++;
                }

                System.out.println("Upper Case Count: " + upperCaseCount);
                System.out.println("Lower Case Count: " + lowerCaseCount);

        }

    }
}
