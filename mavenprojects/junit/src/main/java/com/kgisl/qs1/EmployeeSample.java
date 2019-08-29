package com.kgisl.qs1;

import static java.util.Comparator.comparing;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * EmployeeSample
 */
public class EmployeeSample {

        public static void main(String[] args) {
                List<Employee> emp = Arrays.asList(new Employee("sasikumar", 72), new Employee("gk", 60),
                                new Employee("sathyaraj", 70), new Employee("prabhakar", 58),
                                new Employee("diwakar", 99), new Employee("sasikumar", 45));

                System.out.println("Maximum:");
                emp.stream().max(Comparator.comparing(Employee::getName))
                                .ifPresent(p -> System.out.println("sort by alphabet order person max" + p)); // MAX

                System.out.println("Minimum");
                emp.stream().min(Comparator.comparing(Employee::getName))
                                .ifPresent(p -> System.out.println("sort by alphabet order person min" + p)); // MIN

                System.out.println("Filter");
                List<Employee> lst1 = emp.stream().filter(s -> s.getName().startsWith("s"))
                                .collect(Collectors.toList());
                lst1.stream().forEach(System.out::println); // FILTER

                System.out.println("Count");
                long n = emp.stream().filter(e -> e.getName().endsWith("r")).count();
                System.out.print("Count is:");
                System.out.println(n); // COUNT

                System.out.println("Count");
                long n1 = emp.stream().count();
                System.out.print("Count is:");
                System.out.println(n1); // COUNT2

                System.out.println("Distinct");
                List<String> d = emp.stream().map(Employee::getName).distinct().collect(Collectors.toList());
                d.forEach(System.out::println); // DISTINCT

                System.out.println("Skip");
                emp.stream().skip(3).forEach(System.out::println); // SKIP

                System.out.println("Limit");
                emp.stream().limit(3).forEach(System.out::println); // LIMIT

                System.out.println("All match");
                boolean b1 = emp.stream().allMatch(p1 -> p1.getAge() > 50 && p1.getName().startsWith("s"));
                System.out.println(b1); // ALLMATCH

                System.out.println("Any match");
                boolean b2 = emp.stream().anyMatch(p1 -> p1.getAge() > 50 && p1.getName().startsWith("s"));
                System.out.println(b2); // ANYMATCH

                System.out.println("None match");
                boolean b3 = emp.stream().noneMatch(p1 -> p1.getAge() > 50 && p1.getName().startsWith("s"));
                System.out.println(b3); // NONEMATCH

                System.out.println("String reduce");
                String[] str = { "This", "is", "stream" };
                String result = Arrays.stream(str).reduce("", (s, r) -> s + r);
                System.out.println(result); // STRINGREDUCE

                System.out.println("Int reduce");
                int[] i = { 3, 5, 8, 4 };
                int result1 = Arrays.stream(i).reduce(0, (a, r) -> a + r);
                System.out.println(result1); // INTREDUCE

                System.out.println("Find any");
                Optional<Employee> empAgeAbove60 = emp.stream().filter(f -> f.getAge() > 90).findAny();
                if (empAgeAbove60.isPresent()) {
                        System.out.println("Age above 60:" + empAgeAbove60.get());
                } // FINDANYUSINGAGE

                System.out.println("Find any");
                Optional<Employee> nameStartsWith = emp.stream().filter(f1 -> f1.getName().startsWith("d")).findAny();
                if (nameStartsWith.isPresent()) {
                        System.out.println("Name starts with s:" + nameStartsWith.get());
                }

                System.out.println("Find first");
                Optional<Employee> ff = emp.stream().filter(f1 -> f1.getAge() > 70).findFirst();
                if (ff.isPresent()) {
                        System.out.println("First element is:" + ff.get());
                } // FINDFIRST

                System.out.println("Find first");
                Optional<Employee> f1 = emp.stream().findFirst();
                System.out.println("First element is:" + f1.get()); // FINDFIRST

                System.out.println("Sort age");
                List<Employee>
                lst2=emp.stream().sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
                lst2.forEach(System.out::println); //SORTAGE

                System.out.println("Sort name");
                List<Employee>
                lst3=emp.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
                lst3.forEach(System.out::println); //SORTNAME

        }
}
               
               


                
                
