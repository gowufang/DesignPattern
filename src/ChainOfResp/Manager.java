package ChainOfResp;

/**
 * 经理
 * Created by Administrator on 2018/7/4.
 */
public class Manager extends Leader{
    public Manager(String name){
        super(name);

    }

    @Override
    protected void handerRequest(LeaveRequest request) {

       if (request.getDaysULeave()<10){

           System.out.println("员工"+request.getName()+" "+"请假天数"+request.getDaysULeave()+" 请假理由"+request.getReason());
           System.out.println("经理"+this.name+"，审批通过！");
       }else{
           this.nextLeader.handerRequest(request);
       }
    }
}
