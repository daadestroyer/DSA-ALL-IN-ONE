package Babbar.CrackerSheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Follow-ups:

1. How can we prove that at least one duplicate number must exist in nums?
2. Can you solve the problem without modifying the array nums?
3. Can you solve the problem using only constant, O(1) extra space?
4. Can you solve the problem with runtime complexity less than O(n2)?
*/
public class App11_FindTheDuplicateNumber_In_Array_Of_N_Plus_1_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int[] a = new int[S];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int slow = a[0];
        int fast = a[0];

        // move fast pointer by 2 and slow pointer by 1

        do {
            slow = a[slow];
            fast = a[a[fast]];
        }
        while (slow != fast);

        // again put the fast pointer at start and move until fast != slow

        fast = a[0];
        while (fast != slow) {
            slow = a[slow];
            fast = a[fast];
        }
        System.out.println(fast);
        System.out.println(Arrays.toString(a));
    }
}
