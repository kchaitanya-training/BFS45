import java.util.Locale;
//provide some samples on uppercase and lowercase functionality
// and concatination using concat method and + operation substring
// method of String ,contains,charAt,indexAt

public class StringOperation {

    public void upperCase(String word) {
        System.out.println(word.toUpperCase());
    }

    public void lowerCase(String word) {
        System.out.println(word.toLowerCase());
    }
    public void concatWords(String word) {
        System.out.println(word.concat(" World"));
    }
    public void checkLetter(String word) {
        System.out.println(word.contains("lo"));
    }

    public void printCharacter(String word) {
        System.out.println(word.charAt(3));
    }
    public void printIndex(String word) {
        System.out.println(word.indexOf("r"));
    }

    public void printSubString(String word) {
        System.out.println(word.substring(7,20));
    }


    public static void main(String[] args) {
        StringOperation res = new StringOperation();

        res.upperCase("hello");
        res.lowerCase("HeLLo");
        res.concatWords("Hello");
        res.checkLetter("Hello");
        res.printCharacter("Jordan");
        res.printIndex("World");
        res.printSubString("Antidisestablishmentarianism");
    }

}
