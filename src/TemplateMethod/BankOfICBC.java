package TemplateMethod;

/**
 * Created by Administrator on 2018/7/6.
 */
public class BankOfICBC extends BankTaskTemplate {
    @Override
    public void transact() {
        System.out.println("这是工商银行的交易方式");
    }
}
