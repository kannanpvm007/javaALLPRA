package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * HowForEachWorks
 */
public class HowForEachWorks {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("sasi", "shiens", "gk", "prabha", "sathyaraj");
        // Consumer<String> con = new Consumer<String>() {

        //     public void accept(String t) {
        //         System.out.println(t);
        //     }
        // };
        // names.forEach(con);

        // Consumer<String> con=t->System.out.println(t);
        // names.forEach(con);
         names.forEach(System.out::println);
    }
}
