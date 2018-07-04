package ChainOfResp;

/**
 * Created by Administrator on 2018/7/4.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name){
        super();
        this.name=name;
    }
    public void setNextLeader(Leader nextLeader){
        this.nextLeader=nextLeader;
    }
    protected abstract void handerRequest(LeaveRequest request);
}
