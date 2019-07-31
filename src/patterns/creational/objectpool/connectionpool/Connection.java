package patterns.creational.objectpool.connectionpool;

public class Connection {
    String dsn;
    String usr;
    String pwd;
    ConnectionStatus status;

    public Connection(String dsn, String usr, String pwd) {
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
        this.status = ConnectionStatus.READY;
    }

    public void close() throws Exception {
        this.status = ConnectionStatus.CLOSE;
    }

    public boolean isClosed() throws Exception{
        return (this.status == ConnectionStatus.CLOSE);
    }
}
