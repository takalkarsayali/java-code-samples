/*
   Take an array as input from user.Search for a given number X and print the index at which it is present
 */
import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements:");
        //input
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is:");
        System.out.print("[ ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println("]");
        
        //Searching for a element in array
        System.out.print("Enter the number to search: ");
        int X = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == X){
                System.out.println("X("+ X +") found at index "+i);
            }else{
                System.out.println(X+" not found.");
            }
            return;
        }

    }
}
