package ChainOfResp;

/**
 * Created by Administrator on 2018/7/4.
 */
public class Test {
    public static void main(String[] args){
        Leader a=new Director("zhangsan");
        Leader b=new Manager("lisi");
        Leader c=new BigManager("wangwu");

        //组织责任链的关系，形成链表，这里定义的是领导<经理<大经理
        a.setNextLeader(b);
        b.setNextLeader(c);
        LeaveRequest request=new LeaveRequest("wu",5,"gohome");
        a.handerRequest(request);
        //用责任链的好处是到时候链表的关系我们可以写到配置文件里,在通过反射去处理，而不需要在源文件中用ifelse条件修改。
        // 修改链表之间的关系的时候也更加方便，不需要在原来程序的代码（已有的类不需要改动），
        // 修改的仅仅是链表的关系，以及新添加一个责任链的节点而已
    }
}
