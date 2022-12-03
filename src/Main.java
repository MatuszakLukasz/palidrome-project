public class Main {


    public static boolean isItPalidrome(String word)
    {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        String first = "abba";
        String second = "ala";
        String third = "sedes";
        String fourth="lukasz";


        System.out.println(isItPalidrome(first));
        System.out.println(isItPalidrome(second));
        System.out.println(isItPalidrome(third));
        System.out.println(isItPalidrome(fourth));
    }
}