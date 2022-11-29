package sk.ulohy.upravaZnakovRetazec;

public class GFGsubstring {

    static String swap(String str, int i, int j) {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i);

        return str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i) + str.substring(j + 1, str.length());
    }

    public static void main(String args[]) {

        String s = "geeksforgeeks";
        String newS = swap(s, 6, s.length() - 2);
        String newS2 = swap(s, 0, s.length() - 1);
        System.out.println(newS);
        System.out.println(newS2);
// Original String doesn't change
        System.out.println(s);
    }

}
