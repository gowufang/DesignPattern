package ObserverPattern;



/**
 * @author H366103
 * @description: 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @date 08-Sep-20
 */
public interface  Observerable {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
