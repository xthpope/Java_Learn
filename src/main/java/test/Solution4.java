package test;

/**
 * @author : xutinghao
 * @date : 2022/3/24 08:53
 * @description :
 */
public class Solution4 {

    public String replaceSpace(String s) {
        String[] split = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(" ".equals(split[i])){
                sb.append("%20");
            }else{
                sb.append(split[i]);
            }
        }
        return sb.toString();
    }

    public String replaceSpace1(String s) {
        int length = s.length();
        char[] chars = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            if(' ' == (s.charAt(i))){
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            }else{
                chars[size++] = s.charAt(i);
            }
        }
        return new String(chars,0,size);
    }

    public static void main(String[] args){
        String s = "We are happy.";
        String s1 = new Solution4().replaceSpace1(s);
        System.out.println(s1);
    }
}
