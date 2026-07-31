public class Solution {


    public static void main(String[] args) {

        String ransomNote = "a", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));

    }


    private static  boolean canConstruct(String ransomNote, String magazine){

        int[] freq = new int[26];


//        magazine
        for ( char ch : magazine.toCharArray()){
            freq[ch -'a']++;
        }

//        check with ransom
        for ( char ch : ransomNote.toCharArray()){
            if ( freq[ch -'a'] == 0){
                return false;
            }

            freq[ch - 'a']--;
        }
        return true;
    }
}
