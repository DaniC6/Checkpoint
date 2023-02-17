public class ConnectionDB {

    private static final String dbName = "mydb";
    private static final String url = "jdbc:mysql://localhost:3306/" + dbName;
    private static final String user = "root";
    private static final String password = "060891";

    public static String getDbName() {
        return dbName;
    }

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}


