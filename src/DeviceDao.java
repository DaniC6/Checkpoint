import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeviceDao {

    Device dev = null;
    ResultSet res = null;

    List<Device> deviceWithCos = new ArrayList<> ();


    public List<Device> getAllDeviceWIthHearthRateAndGps(String username){

        try(Connection conn = DriverManager.getConnection (ConnectionDB.getUrl(),ConnectionDB.getUser(),ConnectionDB.getPassword());
            PreparedStatement prep = conn.prepareStatement ("SELECT * FROM device WHERE device_has_gps = ? AND device_has_heartrate = ? AND username = ?" )){

            prep.setInt (1,1);
            prep.setInt (2,1);
            prep.setString (3,username);

            res = prep.executeQuery ();

            while ((res.next ())){

                dev = new Device (res.getString ("DEVICE_PART_NUMBER"),
                                  res.getString ( "DEVICE_MANUFACTURER").toLowerCase (),
                                  res.getString ( "DEVICE_MODEL" ).toUpperCase (),
                                  res.getShort ( "DEVICE_HAS_GPS" ),
                                  res.getShort ( "DEVICE_HAS_HEARTRATE"),
                                  res.getString ( "USERNAME" ));

                deviceWithCos.add (dev);

            }


        } catch (SQLException e) {
            e.printStackTrace ();
        }


      return deviceWithCos;

    }

}
