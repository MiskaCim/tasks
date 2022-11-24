package sk.ulohy.znakyVeta;

public class ZnakyVeta {

    public static void main(String[] args) {

        String sentence = "Dnes na obed som mal 100g gnochi s 1 ks bryndzou, boli velmi dobre.";
        int vovelNr = 0, consonantsNr = 0, otherNr = 0, numberNr = 0;

//  Skusit jednotlive samohlasky... ulozit do noveho pola
//        char[] vovelArr = new char[vovelNr];
//        char[] consonantsArr = new char[consonantsNr];
//        char[] otherArr = new char[otherNr];
//        int[] numberArr = new int[numberNr];
//        int v = 0, c = 0, o = 0, n = 0;
        char ch;

        System.out.println(sentence);
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++){
            ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                vovelNr++;
//                vovelArr[v++] = ch[i];
            } else if (ch >= 'a' && ch <= 'z'){
                consonantsNr++;
            } else if (ch >= '0' && ch <= '9'){
                numberNr++;
            } else {
                otherNr++;
            }
        }

        System.out.println("Number of vovels: " + vovelNr);
        System.out.println("Number of consonants: " + consonantsNr);
        System.out.println("Number of numbers: " + numberNr);
        System.out.println("Number of other: " + otherNr);

    }
}
