/*
    *Strings are Immutable
 */

import java.util.*;

public class StringBuilders{
    public static void main (String []args){
        
        //Declaration 
        StringBuilder sb = new StringBuilder("Tony");

        //Some functions are similar to Strings 
        // 1.charAt()
        // 2.length()

        //setChatAt(index,char)
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert(index,element)
        System.out.println(sb.insert(0,'S'));
        System.out.println(sb.insert(3,'n'));

        //delete(starting index, ending index)
        System.out.println(sb.delete(2,3));
        System.out.println(sb.delete(2,4));

        // append(char)
        StringBuilder sb2 = new StringBuilder("Tony");
        System.out.println(sb2.append(" Stark"));

    }
}