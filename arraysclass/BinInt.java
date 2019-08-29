import java.util.Arrays;

/**
 * BinInt
 */
public class BinInt {

    public static void main(String[] args) {
        int a[] = { 107, 5780, 2056, 40, 305 };
        Arrays.sort(a);
        System.out.println("The sorted int array is:");
        for (int number : a) {
            System.out.println("Number = " + number);
        }
        int Val = 2056;
        int retVal = Arrays.binarySearch(a, 1, 5, Val);
        System.out.println("The index of element 12 is : " + retVal);
    }
}
