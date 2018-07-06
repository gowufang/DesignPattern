package TemplateMethod;

/**
 * Created by Administrator on 2018/7/6.
 */
public class Test {
    public static void main(String[] args){
        BankOfChina bankOfChina=new BankOfChina();
        bankOfChina.process();//可以看到结构是一样的，具体银行怎么交易的业务不一样
    }
}
