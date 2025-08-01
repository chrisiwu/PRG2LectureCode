package at.ac.fhcampuswien.block01.examples.example04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Bob", "Jennifer");
        System.out.println(names);

        // before Java 8 use of anonymous interface
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names);

        // Lambdas to the rescue
        // step 1
        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println(names);

        // step 2 remove return
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        System.out.println(names);

        // step 3 remove the data types
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}