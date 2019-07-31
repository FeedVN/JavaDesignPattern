package patterns.creational.objectpool.connectionpool;

public class DriverManager {
    public static Connection getConnection(String dsn, String usr, String pwd) throws Exception {
        return new Connection(dsn, usr, pwd);
    }
}
