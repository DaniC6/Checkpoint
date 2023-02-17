import com.mysql.cj.Session;

import java.util.Date;
import java.util.List;

public class TrainingSessionWithData {

    private List<TrainingSessionData> trainingSessionData;
    private int idTrainingSession;
    private Date startTime;
    private Date endTime;
    private Session sessionType;
    private String userUsername;



    public List<TrainingSessionData> getTrainingSessionData() {
        return trainingSessionData;
    }

    public void setTrainingSessionData(List<TrainingSessionData> trainingSessionData) {
        this.trainingSessionData = trainingSessionData;
    }

    public int getIdTrainingSession() {
        return idTrainingSession;
    }

    public void setIdTrainingSession(int idTrainingSession) {
        this.idTrainingSession = idTrainingSession;
    }

    public Date getStartTime() {
        return startTime;
    }
}

