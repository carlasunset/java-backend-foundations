package Section20_JDBC_Database_Access.first_connection.application;

import Section20_JDBC_Database_Access.first_connection.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
