import java.util.Arrays;

/**
 * ArrayDeep
 */
public class ArrayDeep {

    public static void main(String[] args) {
        Object[] de1 = { 'a', 'b' };
        System.out.println("The element in array 1 is:");
        for (Object obj : de1) {
            System.out.println("Value=" + obj);
        }
        Object[] de2 = { 'a', 'b' };
        System.out.println("The element in array 2 is:");
        for (Object obj : de2) {
            System.out.println("Value=" + obj);
        }
        Object[] de3 = { 'c', 'd' };
        System.out.println("The element in array 3 is:");
        for (Object obj : de3) {
            System.out.println("Value=" + obj);
        }
        Object[] de4 = { 'e', 'f' };
        System.out.println("The element in array 4 is:");
        for (Object obj : de4) {
            System.out.println("Value=" + obj);
        }

        System.out.println("The element of array 1 and array 2 is equal:" + Arrays.deepEquals(de1, de2));
        System.out.println("The element of array 1 and array 3 is equal:" + Arrays.deepEquals(de1, de3));
        System.out.println("The element of array 3 and array 4 is equal:" + Arrays.deepEquals(de3, de4));
    }
}