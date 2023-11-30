// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

        If you want to know more: http://en.wikipedia.org/wiki/DNA

        In DNA strings, symbols "A" and "T" are complements of each other,
        as "C" and "G". Your function receives one side of the DNA (string, except for Haskell);
        you need to return the other complementary side. DNA strand is never empty or there is no
        DNA at all (again, except for Haskell).

        More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

        Example: (input --> output)

        "ATTGC" --> "TAACG"
        "GTAT" --> "CATA"
         */
        System.out.println(complementaryDNA("ATTGC"));
    }
    public static String complementaryDNA(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length());
        for(int i = 0; i < chars.length ; i++) {
            switch (chars[i]) {
                case 'A':
                    chars[i] = 'T';
                    break;
                case 'T':
                    chars[i] = 'A';
                    break;
                case 'G':
                    chars[i] = 'C';
                    break;
                case 'C':
                    chars[i] = 'G';
                    break;
                default:
                    chars[i] = ' ';
                    break;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}