package ChainOfResp;

/**
 * 经理
 * Created by Administrator on 2018/7/4.
 */
public class BigManager extends Leader{
    public BigManager(String name){
        super(name);

    }

    @Override
    protected void handerRequest(LeaveRequest request) {

       if (request.getDaysULeave()<30){

           System.out.println("员工"+request.getName()+" "+"请假天数"+request.getDaysULeave()+" 请假理由"+request.getReason());
           System.out.println("大经理"+this.name+"，审批通过！");
       }else{
//           this.nextLeader.handerRequest(request);   //到达责任链末端，所以不能再交给下一个处理人了
           System.out.println("莫非"+request.getName()+"想辞职"+"居然请假"+request.getDaysULeave());
       }
    }
}
