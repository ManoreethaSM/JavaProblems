import java.util.*;

public class romanToInteger {

    public static void main(String[]args)
    {
        String s="M";
        System.out.println(change(s));
    }
    public static int change(String s) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1)))
            {
            k-=m.get(s.charAt(i));
            }
            else
            {
                k+=m.get(s.charAt(i));
            }
        }
        return k;
             }
}