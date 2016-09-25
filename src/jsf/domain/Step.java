package jsf.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mmilcic on 29.4.2016..
 */
@Entity
@Table(name = "korak")
public class Step implements Serializable {

    @Id
    @Column(name = "id_koraka")
    private int stepID;

    @Column(name = "naziiv_koraka")
    private String stepName;

    @ManyToOne
    @JoinColumn(name = "id_aktivnosti")
    private Activity activity;

    public Step() {
    }

    public Step(int stepID, String stepName, Activity activity) {
        this.stepID = stepID;
        this.stepName = stepName;
        this.activity = activity;
    }

    public int getStepID() {
        return stepID;
    }

    public void setStepID(int stepID) {
        this.stepID = stepID;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Step{" +
                "stepID=" + stepID +
                ", stepName='" + stepName + '\'' +
                ", activity=" + activity +
                '}';
    }
}
