package at.ac.fhcampuswien.block04.examples.example06.good_example;

/* Dependency Injection:
   - programming technique that makes a class
       independent of its dependencies
       - by decoupling the usage of an object from its creation
       - in simple words: provide a class the objects it needs
           instead of using new keyword in the class
   - helps to follow SOLID's Single Responsibility
       and Dependency Inversion
   - enables easy testing (mocked objects) */
public class ReportService {
    private final ReportDAO dao;

    public ReportService(ReportDAO dao) {
        this.dao = dao;
    }
}