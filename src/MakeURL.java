public class MakeURL {

    public static String ToURL(String str, int givenLength){
        char[] s = str.toCharArray();
        int spaces = 0;

        for (int i = 0; i < givenLength; i++) {
            if(s[i] == ' ')
                spaces++;
        }

        int totalLength = givenLength + spaces * 2;

        if(s.length > givenLength)
            s[givenLength] = '\0';

        for (int i = givenLength - 1; i >= 0; i--) {

            if(s[i] == ' '){

                s[totalLength - 1] = '0';
                s[totalLength - 2] = '2';
                s[totalLength - 3] = '%';
                totalLength = totalLength - 3;

            }else{

                s[totalLength - 1] = s[i];
                totalLength--;

            }

        }

        return new String(s);
    }
}
