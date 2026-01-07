package Section20_JDBC_Database_Access.demo_transaction.db;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String msg){
        super(msg);
    }

}
