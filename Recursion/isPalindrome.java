//HackerRank : https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-ispalindrome/problem



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.print(palindromChecker(s,0,s.length()-1));
    }
    
    public static boolean palindromChecker(String s , int i , int j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        if(i>=j){
            return true;
        }
        palindromChecker(s,i+1,j-1);
        return true;
    }
}
