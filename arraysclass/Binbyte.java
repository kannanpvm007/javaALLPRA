import java.util.Arrays;

/**
 * Binbyte
 */
public class Binbyte {

    public static void main(String[] args) {
        byte a[] = { 10, 40, 20, 50, 30 };
        Arrays.sort(a);
        System.out.println("The Sorted Array is:");
        for (byte val : a) {
            System.out.println("Number=" + val);
        }
        byte searchval = 20;
        int retval = Arrays.binarySearch(a, searchval);
        System.out.println("The index of the element is:" + retval);

    }
}