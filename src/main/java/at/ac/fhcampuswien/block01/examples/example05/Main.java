package at.ac.fhcampuswien.block01.examples.example05;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Bob", "Jennifer");

        names.sort((current, next) -> current.compareTo(next)); // sort names
        names.sort(String::compareTo); // even shorter with method reference call

        names.forEach(name -> System.out.println(name)); // print each name
    }
}