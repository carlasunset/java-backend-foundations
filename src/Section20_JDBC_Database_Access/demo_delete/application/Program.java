package Section20_JDBC_Database_Access.demo_delete.application;

import Section20_JDBC_Database_Access.demo_delete.db.DbIntegrityException;
import Section20_JDBC_Database_Access.demo_update.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE Id = ?");

            preparedStatement.setInt(1, 5);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! Rows Affected: " + rowsAffected);
        }
        catch (SQLException e){
           throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}