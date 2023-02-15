package test;

import java.util.HashMap;

/**
 * @author : xutinghao
 * @date : 2022/3/26 11:45
 * @description :
 */
public class Solution10 {

    public char firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return ' ';
        }
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],!map.containsKey(chars[i]));
        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i])){
                return chars[i];
            }
        }
        return ' ';
    }
}
