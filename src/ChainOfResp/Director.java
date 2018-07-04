package ChainOfResp;

/**
 * 小领导
 * Created by Administrator on 2018/7/4.
 */
public class Director extends Leader{
    public Director(String name){
        super(name);

    }


    @Override
    public void setNextLeader(Leader nextLeader) {
        super.setNextLeader(nextLeader);
    }

    @Override
    protected void handerRequest(LeaveRequest request) {

       if (request.getDaysULeave()<3){

           System.out.println("员工"+request.getName()+" "+"请假天数"+request.getDaysULeave()+" 请假理由"+request.getReason());
           System.out.println("领导"+this.name+"，审批通过！");
       }else{
           this.nextLeader.handerRequest(request);
       }
    }
}
