public class StringConpression {

    public static String Compress(String s){

        int[] charsCount = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int charNr = s.charAt(i);
            charsCount[charNr]++;
        }

        String newString = "";

        for (int j = 0; j < charsCount.length; j++) {
            if(charsCount[j] != 0)
                newString += "" + (char)j + charsCount[j];
        }

        return newString.length() >= s.length() ? s : newString;
    }

    public static String Compress2(String s){
        String newString = "";
        int charCount = 0;

        for (int i = 0; i < s.length(); i++) {
            charCount++;
            if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                newString += s.charAt(i) + Integer.toString(charCount);
                charCount = 0;
            }
        }

        if(newString.length() >= s.length())
            return s;

        return newString;
    }
}
