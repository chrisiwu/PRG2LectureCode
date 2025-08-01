package at.ac.fhcampuswien.block04.examples.example07;

/* Singleton:
   - ensures that a class has only one instance,
       while providing a global access point to instance
   - use cases:
       - use when a class in your program should have
           just a single instances for all clients:
           - single database/file object shared by
               different parts of the program
           - controller, logging, configurations classes
   - use when you need stricter control
       over global variables */

public class Logger {
    // 1. add a private static field for storing singleton instance
    private static Logger instance;

    // 2. make constructor of class private
    private Logger() {

    }

    // 3. declare a public static creation method for getting the instance
    // 4. replace direct calls with calls to static creation method in your program
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}