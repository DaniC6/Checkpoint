import java.sql.*;

public class TrainingDao {


    TrainingSessionWithData trainingSessionData = null;
    ResultSet res = null;

    public TrainingSessionWithData getTraningSessionDataByTrainingId(Integer trainingId) {

        try (Connection conn = DriverManager.getConnection ( ConnectionDB.getUrl (), ConnectionDB.getUser (), ConnectionDB.getPassword () );
             PreparedStatement prep = conn.prepareStatement ("SELECT * FROM training_session AS ts\n" +
                     "INNER JOIN training_session_data AS tsd ON ts.ID_TRAINING_SESSION = tsd.ID_TRAINING_SESSION_DATA" +
                     "WHERE id_training_session = ?")) {

            prep.setInt (1,trainingId);

            res = prep.executeQuery ();

            while ((res.next ())){


            }




        } catch (SQLException e) {
            e.printStackTrace ();
        }

       return

    }

}
