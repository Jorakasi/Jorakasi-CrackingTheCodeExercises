public class URLify {

    /*
    Write a method to replace all spaces in a string with %20. You may assume that the string has sufficient
    space at the end to hold the additional characters, and that you are given the true length of the string.
     */

    void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, index, i;
        for (int j = 0; j < length; j++) {
            if (str[j] == ' ') {
                spaceCount++;
            }
        }
        index = length + spaceCount * 2;
        if (length < str.length) str[length] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
