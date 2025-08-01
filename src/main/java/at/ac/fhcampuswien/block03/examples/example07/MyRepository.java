package at.ac.fhcampuswien.block03.examples.example07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MyRepository {
    public boolean add(MyElement el) throws SQLException {
        String sql = "INSERT INTO elements (id, this, that) VALUES (?, ?, ?)";
        Connection connection = DatabaseUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, el.getId().toString());
        statement.setString(2, el.getThis());
        statement.setString(3, el.getThat());
        statement.executeUpdate();

        return false;
    }

    public List<MyElement> getAll() throws SQLException {
        return null;
    }

    public boolean update(MyElement el) throws SQLException {
        return false;
    }

    public boolean delete(MyElement el) throws SQLException {
        return false;
    }
}