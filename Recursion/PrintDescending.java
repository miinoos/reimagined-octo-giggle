//HackerRank Practice : https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-print-decreasing-hw/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        recursionHelper(n);
    }
    
    public static void recursionHelper(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursionHelper(n-1);
        
    }
}
