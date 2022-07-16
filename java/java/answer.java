package practice;

import java.util.Arrays;
import java.util.Scanner;
class Solution {
     static int[] solution(int n, int m) {
        int[] answer = new int [2];
       
        int i = 1;
        while(i <=n && i<=m){
            if(n%i==0 && m%i==0){
                answer[0] = i;
            }
            i++;
            }
        
        answer [1] = m*n/answer[0];                             
        return answer;    
      }   
}

class answer extends Solution{
    public static void main(String args[]){     	
    	 Scanner sc = new Scanner(System.in);	 
    	 int[] i = solution(sc.nextInt(), sc.nextInt());
    	System.out.println(Arrays.toString(i));

    }    
}