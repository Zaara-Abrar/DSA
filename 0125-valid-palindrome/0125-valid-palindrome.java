import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if(Objects.equals(s, " ")) return true;
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(((s.charAt(i)>=97) && (s.charAt(i)<=122)) || ((s.charAt(i)>=48) && (s.charAt(i)<=57))) ch.add(s.charAt(i));
        }
        int m=ch.size()-1;
        for(int i=0;i<ch.size()-1;i++){
            if(ch.get(i)!=ch.get(m)) return false;
            m--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st= "a man nama";
        boolean result= Solution.isPalindrome(st);
        if(result) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}