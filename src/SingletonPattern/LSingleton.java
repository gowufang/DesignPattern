package SingletonPattern;

/**
 * Created by Administrator on 2018/8/3.
 * 懒汉式
 * 只能在单线程下使用。如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 */
public class LSingleton {
    private static LSingleton SINGLETON;
    public static LSingleton getSingleton(){
        if (SINGLETON==null){
            SINGLETON=new LSingleton();
        }
        return SINGLETON;
    }
}
