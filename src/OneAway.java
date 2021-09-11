public class OneAway {

    public static void Test(String s1, String s2){
        System.out.printf("One away check for %s and %s is %s \n", s1, s2, Check(s1, s2));
    }

    static boolean Check(String s1, String s2){
        if(Math.abs(s1.length() - s2.length()) > 1)
            return false;
        else if(s1.equals(s2))
            return true;
        else return Changes(s1, s2);
    }

    public static boolean Changes(String s1, String s2){

        int changedChars = 0;

        for (int i = 0; i < s1.length(); i++) {
            if(i < s2.length()) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    changedChars++;
                }
            }else{
                changedChars++;
            }
        }

        return changedChars <= 1;
    }

}
