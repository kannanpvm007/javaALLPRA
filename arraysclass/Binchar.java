import java.util.Arrays;

/**
 * Binchar
 */
public class Binchar {

    public static void main(String[] args) {
        char a[] = { 'g', 'a', 'h', 'r', 'd' };
        // Arrays.sort(a);
        // System.out.println("The Sorted Array is:");
        for (char val : a) {
            System.out.println("Value=" + val);
        }
        char searchVal = 'g';
        int retval = Arrays.binarySearch(a,0,4, searchVal);

        System.out.println("The index of the element is: " + retval);

    }
}