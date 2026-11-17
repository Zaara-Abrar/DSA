class Solution {
    static boolean matc(int c[],int d[])
    {
        int i;
        for(i=0;i<26;i++)
        {
            if(c[i]!=d[i])
            return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length())
       return false;
       int a[]=new int[26];
       int b[]=new int [26];
       int i;
       for(i=0;i<s1.length();i++)
       a[s1.charAt(i)-'a']++;
  int win=s1.length();
       for(i=0;i<s1.length();i++)
       {
         b[s2.charAt(i)-'a']++;
       }

       if(matc(a,b))
       return true;

       for(i=win;i<s2.length();i++)
       {
        b[s2.charAt(i)-'a']++;
        b[s2.charAt(i-win)-'a']--;
        if(matc(a,b))
        return true;
       }
       return false;
    }
}