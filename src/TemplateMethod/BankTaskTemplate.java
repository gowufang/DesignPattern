package TemplateMethod;

/**
 * Created by Administrator on 2018/7/6.
 */
public abstract class BankTaskTemplate {
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact();//子类去实现

    public void evaluate(){
        System.out.println("反馈评分");
    }
    public final void process(){//核心！把基本操作组合到一起，final是因为一般不让子类去修改
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
