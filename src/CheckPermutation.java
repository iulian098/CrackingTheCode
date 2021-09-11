import java.util.Arrays;

public class CheckPermutation {

    public static String SortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }

    public static boolean Check(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        return SortString(s1).equals(SortString(s2));
    }

}
