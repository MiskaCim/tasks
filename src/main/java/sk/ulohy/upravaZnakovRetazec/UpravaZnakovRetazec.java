package sk.ulohy.upravaZnakovRetazec;

public class UpravaZnakovRetazec {

    static String newStr;

//    static String swap(String str, int i, String str2) {
//        newStr = str.substring(0, 1) + str2 + str.substring(i + 2, i + 3) + str2;
//        return newStr;
//    }

    static String swap(String str, int i, String str2) {
        for(int x = 0; x < str.length(); x=x+2) {
            newStr = str.substring(x, x+1) + str2;
        }
        return newStr;
    }

    public static void main(String args[]) {

        String s1 = "Hello world!";
        String s2 = "1";

        swap(s1, 0, s2);
        System.out.println(newStr);

    }
}
