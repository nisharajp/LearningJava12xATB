public class VowelConsonantCount {

    public static void main (String[] args){

        String[] fruitName = {"Apple", "Orange", "BAnana", "PineApple", "Pear"};

        for(String str: fruitName){
            int vowelCount = 0;
            int consonantCount = 0;

            for(char c: str.toCharArray()){
                c = Character.toLowerCase(c);
                if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
                    vowelCount++;}
                else{
                    consonantCount++;
                }
                System.out.println("Fruit Name "+ str);
                System.out.println("Vowel Count "+ vowelCount);
                System.out.println("Consonant Count "+ consonantCount);
                }
            }
        }
    }


