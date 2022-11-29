package sk.ulohy.upravaZnakovRetazec;

public class VymenaZnakov {

    public static void main(String[] args) {
        String input1 = "Hello world!";

        for (int i = 0; i < input1.length(); i++) {
            System.out.println(input1.charAt(i));
        }

        System.out.println(input1);
        String newInput1 = String.valueOf(swap(input1, 0, input1.length() - 1));
        System.out.println(newInput1);
    }


    static char[] swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}
