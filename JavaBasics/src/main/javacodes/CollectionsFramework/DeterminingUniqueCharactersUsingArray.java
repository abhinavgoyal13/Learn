package javacodes.CollectionsFramework;

//Algorithm to determine if string has unique characters
public class DeterminingUniqueCharactersUsingArray {

    public boolean determineUniqueChars(String str) {
        str=str.toLowerCase();
        int[] ascii = new int[256];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i)]++;
        }
        for (int x : ascii) {
            if (x > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        DeterminingUniqueCharactersUsingArray duc = new DeterminingUniqueCharactersUsingArray();
        System.out.println(duc.determineUniqueChars("acbskjsabvkas"));
    }
}
