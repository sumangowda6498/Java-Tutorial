package chapter8_String;

public class StringOperation {
    public static void main(String[] args) {
        countwords("I will become a developer");
        reverseword("P A K I S T A N");
        addSpaces(" heyBuddyHowAreYou");
    }
    public static void countwords(String text){
        var word=text.split(" ");
        int wordLength= word.length;

        String message=String.format("your sentence contains %d  words\n",wordLength);
        System.out.printf(message);

        for(int i=0;i<wordLength;i++){
            System.out.printf(word[i]+" ");
        }
        System.out.printf("\n");
    }
    public static void reverseword(String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));//if we use printf it will through an error"no suitable method found for printf(char)"
        }
    }
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i< modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
