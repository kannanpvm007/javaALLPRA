import java.util.Arrays;
/**
 * ArrayClass
 */
public class ArrayUtil{
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        System.out.println(arrayUtil);
        System.out.println(arrayUtil.hashCode());
        int[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println(intArray);
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
        String[] ob={"tuts","point"};
        Arrays.sort(ob);
        System.out.println(Arrays.toString(ob));
        System.out.println(Arrays.deepToString(ob));
        int src=3;
        System.out.println(Arrays.binarySearch(intArray,0,intArray.length,src));
        System.out.println(intArray[Arrays.binarySearch(intArray,0,intArray.length,src)]);
        String arr[] = new String[3];
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, "18");
        System.out.println(Arrays.toString(arr));
        
        System.out.println(intArray.hashCode());
        System.out.println(ob.hashCode());
        System.out.println(arr.hashCode());
        System.out.println(Arrays.equals(arr, ob));
        String a[] = new String[]{"abc","klm","xyz","pqr"};
        String a1[] = {"abc","klm","xyz","pqr"};
    }
}