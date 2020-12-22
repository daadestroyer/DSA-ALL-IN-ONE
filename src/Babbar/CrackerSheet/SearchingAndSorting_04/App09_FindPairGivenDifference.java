package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.*;

public class App09_FindPairGivenDifference {

    // TC : O(N) SC : O(N)
    static int findPairOptimized(int[] ar, int t) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : ar) {
            al.add(i);
        }
        int found = -1;
        for (int i : ar) {
            int sum = t + i;
            if (al.contains(sum)) {
                found = 1;
                break;
            }
        }
        return found;
    }

    // TC : O(Nlogn) SC : O(1)
    static int findPairBruteForce(int[] ar, int t) {
        Arrays.sort(ar);
        int i = 0 , j=1;
        while (i<ar.length && j<ar.length){
            if(i!=j && ar[j]-ar[i]==t){
                return 1;
            }
            else if(ar[j]-ar[i]<t){
                j++;
            }
            else{
                i++;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int tar = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(findPairOptimized(ar,tar));
        }
    }
}
/*

 */