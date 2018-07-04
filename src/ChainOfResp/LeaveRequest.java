package ChainOfResp;

/**
 * Created by Administrator on 2018/7/4.
 */
public class LeaveRequest {
    private String name;
    private int daysULeave;
    private String reason;

    public LeaveRequest(String name, int date, String reason) {
        this.name = name;
        this.daysULeave = date;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysULeave() {
        return daysULeave;
    }

    public void setDaysULeave(int date) {
        this.daysULeave = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
