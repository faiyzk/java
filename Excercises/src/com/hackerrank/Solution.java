package com.hackerrank;
import java.util.Scanner;


public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String str = s.substring(0,k);
        String smallest =str;
        String largest = str;
        
        for(int i=1 ; i<=s.length()-k;i++){
            str = s.substring(i,i+k);
            System.out.println(smallest);
            
            
            if(str.compareTo(largest)>0){
                largest = str;
                
            }
            if(str.compareTo(smallest)<0){
                smallest = str;
            }
            
        }
        
        
        return str;
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


