import java.util.Arrays;
import java.util.List;

public class ArrayAslist {
    public static void main(String args[]) {
        String a[] = { "abc", "klm", "xyz", "pqr" };
        List list1 = Arrays.asList(a);
        System.out.println("The list is:" + list1);
    }
}
