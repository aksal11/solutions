import java.util.*;

public class Solution {


    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for ( String s : strs){
            int[] arr = new int[26];

            for ( char c : s.toCharArray()){
                arr[c-'a']++;
            }

            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
//        return new ArrayList<>(map.values());

//        if it needs to be sorted
        List<List<String>> res = new ArrayList<>(map.values());
        for ( List<String> group : res){
            Collections.sort(group);
        }
        return res;


    }
}
