package Core_Java.String_Handlings;

public class String_Split {
    public static void main(String[] args) {
        String paragraph = "Hi this is Ravi from Hyderabad ";
        String words [] = paragraph.split(" "); // based on the space it divide or split values and stors in array

        for(int i=0; i<words.length; i++){

            System.out.println(words[i]);
        }
    }
}
