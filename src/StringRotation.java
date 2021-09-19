public class StringRotation {
    public static boolean Check(String s1, String s2){

        String newS = s2 + s2;

        return newS.contains(s1);
    }
}
