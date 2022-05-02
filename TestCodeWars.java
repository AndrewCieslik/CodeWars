import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCodeWars {
    public static void main(String[] args) {
        int n =1234;
        int length = String.valueOf(n).length();

        String number = String.valueOf(n);
        String reverse = new StringBuilder(new String(number)).reverse().toString();
        char[] charReverseArray = reverse.toCharArray();
        int[] reverseIntArray = new int[length];

        for (int i = 0; i < length; i++) {
            reverseIntArray[i] = (int)charReverseArray[i] - 48;
        }
        System.out.println(reverseIntArray[3]);
    }


}
