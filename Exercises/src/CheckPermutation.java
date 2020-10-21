import java.util.*;
public class CheckPermutation {

    /*
    Given two strings, write a method to decide if one is a permutation of the other.
    */

    String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String str, String rts) {
        if (str.length() != rts.length()) return false;
        return sort(str).equals(sort(rts));
    }
}
