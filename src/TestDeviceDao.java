import java.sql.SQLException;

public class TestDeviceDao {

    public static void main(String[] args) throws SQLException {

              DeviceDao deviceDao = new DeviceDao ();

        System.out.println (deviceDao.getAllDeviceWIthHearthRateAndGps("paolo"));


    }
}
