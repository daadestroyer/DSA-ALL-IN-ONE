package Babbar.PlacementSeries.Strings;

import java.util.Scanner;

public class App02_RemoveAllWhiteSpacesInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*
        WAY - 1
        for (char ch : str.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                str += ch;
            }
        }
        */
         str=str.replaceAll(" ","");
        System.out.println(str);

    }
}
