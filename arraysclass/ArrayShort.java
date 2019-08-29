import java.util.Arrays;
import java.util.Comparator;

/**
 * ArrayShort
 */
public class ArrayShort {

    public static void main(String[] args) {
        Short a[] = { 5, 2, 15, 52, 10 };
        Comparator<Short> co = null;
        Arrays.sort(a, co);
        System.out.println("The sorted Array is:");
        for (Short num : a) {
            System.out.println("Number=" + num);
        }
        Short searchval = 52;
        int ret = Arrays.binarySearch(a, 1, 4, searchval, co);
        System.out.println("The Index Of element 15 is:" + ret);
        int retval = Arrays.binarySearch(a, 3, 4, searchval, co);
        System.out.println("The Index Of element 15 is:" + retval);
    }
}
