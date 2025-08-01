package at.ac.fhcampuswien.block01.examples.example03;

public class Main {
    public static void main(String[] args) {
        // to return values from a lambda expression
        // the return keyword is used
        // like in normal methods
        MyComparator myComparator = (a, b) -> {
            return a > b;
        };
        System.out.println(myComparator.compare(5, 5));

        // return statement can also be inferred
        MyComparator myComparator2 = (a, b) -> a < b;
        System.out.println(myComparator2.compare(3, 5));

        // Lambda expressions are objects
        // they can be passed around
        // to other functions or classes
        MyComparator myComparator3 = (a, b) -> {
            return a > b;
        };
        boolean isBigger = useLambdaAsParam(3, 5, myComparator3); // pass lambda to function
        System.out.println(isBigger);
    }

    static boolean useLambdaAsParam(int a, int b, MyComparator comparator) {
        return comparator.compare(a, b);
    }
}