import java.util.HashMap;
import java.util.Hashtable;

public class IsUnique {

    public static boolean CheckUnique(String s){

        boolean[] charsCount = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int charNr = s.charAt(i);
            if(charsCount[charNr]){
                System.out.println("Duplicate char found");
                return false;
            }else{
                charsCount[charNr] = true;
            }
        }

        System.out.println("All chars are unique");
        return true;
    }

}
