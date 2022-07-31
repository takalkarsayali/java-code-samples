/*
 - Strings are Immutable
 */

import java.util.*;

public class Strings{
public static void main(String args[]){
    String name = "Tony";
    String fullname = "Tony Stark";
    String sentence = "We can also store a sentence also.";
    System.out.println("Name: " + name);
    System.out.println("Fullname: " + fullname);
    System.out.println("Sentence: " + sentence);
    
    // Inputing String
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter one word: ");
    String name1 = sc.next();  // Only one word is stored here and not spaces
    System.out.println(name1);
    sc.nextLine();
    System.out.print("Enter some word: ");
    String fullname1 = sc.nextLine();    //sentence can be accepted
    System.out.println(fullname1);
    
    // concatenation can be done using '+'

    //Length can be calculated as 
    System.out.println("Length of Sentence: "+sentence.length());

    //charAt
    for(int i = 0; i < name.length(); i++){
        System.out.println(name.charAt(i));
    }
     
    //********comparing strings
    // if(name.compareTo(name1)==0){
    //     System.out.println("Strings are equal");
    // }else{
    //     System.out.println("Strings are not equal");
    // }


    // if(name == name1){
    //     System.out.println("Strings are equal");
    // }else{
    //     System.out.println("Strings are not equal");
    // }
 
    if(new String("Sayali") == new String("Sayali")){
        System.out.println("Strings are equal");
    }else{
        System.out.println("Strings are not equal");
    }

    //sub String
    String subString = sentence.substring(10);
    System.out.println("subString : " + subString);
    System.out.println("subString : " + sentence.substring(0,5));
    System.out.println("subString : " + sentence.substring(3,7));


    // How accept String  after integer and double

    System.out.print("Enter number: ");
    int num = sc.nextInt();
    System.out.print("Enter double: ");
    double doub = sc.nextDouble();
    sc.nextLine();
    System.out.print("Enter String: ");
    String sen = sc.nextLine();
    
    System.out.println("String: " + sen);
    System.out.println("Double: " + doub);
    System.out.println("Int: " + num);

    }
}