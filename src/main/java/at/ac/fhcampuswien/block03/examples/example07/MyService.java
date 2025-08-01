package at.ac.fhcampuswien.block03.examples.example07;

import java.sql.SQLException;
import java.util.List;

public class MyService {
    private final MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public boolean add(MyElement el) throws SQLException {
        return repository.add(el);
    }

    // READ
    public List<MyElement> getAll() throws SQLException {
        return null;
    }

    // UPDATE
    public boolean update(MyElement el) throws SQLException {
        if (el == null || el.getId() == null) {
            throw new IllegalArgumentException("Updated element or ID cannot be null.");
        }

        return repository.update(el);
    }

    // DELETE
    public boolean delete(MyElement el) throws SQLException {
        return false;
    }
}