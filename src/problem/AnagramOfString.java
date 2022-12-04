package problem;

public class AnagramOfString {

    public int remAnagram(String str1, String str2) {

        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();
        int removeCharacterCnt = 0;
        if (lengthStr1 > lengthStr2) {
            for (int i = 0; i < lengthStr1; i++) {
                if (!str2.contains("" + str1.charAt(i)))
                    removeCharacterCnt++;
            }
            return removeCharacterCnt;
        }
        else {
            for(int i=0; i<lengthStr2; i++){
                if(!str1.contains(""+str2.charAt(i))){
                    removeCharacterCnt++;
                }
            }
            return removeCharacterCnt;
        }
    }
}
