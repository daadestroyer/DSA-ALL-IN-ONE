package Babbar.CrackerSheet.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class App09_SubArrayWithSum0 {
    // Hashing based technique
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum = 0;
            boolean flag = false;
            int S = sc.nextInt();
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i =0 ; i<S ; i++){
                int no = sc.nextInt();
                sum = sum + no;
                if(sum==0 || set.contains(sum)){
                    flag = true;
                    break;
                }
                else{
                    set.add(sum);
                }
            }
            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
