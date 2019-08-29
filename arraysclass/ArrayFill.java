import java.util.Arrays;
/**
 * ArrayFill
 */
public class ArrayFill {

    public static void main(String[] args) {
       int a[]={2,4,9,2,5};
        System.out.println("Actual Values:");
        for(int af:a){
            System.out.println("value="+af);
        }
        Arrays.fill(a,1,3);
        System.out.println("Values after filling:");
        for(int af:a){
            System.out.println("value="+af);
        }

    }
}