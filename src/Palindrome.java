import java.util.Locale;

public class Palindrome {

    public static void Test(){
        if(Palindrome.Check("Tact coa")){
            System.out.println("Is palindrome");
        }else{
            System.out.println("No palindrome");
        }

        if(Palindrome.Check("Tact ccaa")){
            System.out.println("Is palindrome");
        }else{
            System.out.println("No palindrome");
        }
    }

    public static boolean Check(String s){
        String newStr = s.replaceAll(" ", "").toLowerCase();
        int[] chars = new int[128];
        int oddNr = 0;

        for (int i = 0; i < newStr.length(); i++) {
            int charNr = newStr.charAt(i);
            chars[charNr]++;
        }

        for (int aChar : chars) {

            if (aChar != 0) {
                if (aChar % 2 != 0) {
                    oddNr++;
                }
            }

        }

        return oddNr <= 1;
    }
}
