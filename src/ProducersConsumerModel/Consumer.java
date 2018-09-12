package ProducersConsumerModel;

import java.util.concurrent.BlockingQueue;

//������
public class Consumer implements Runnable{

    private final BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        //ֻҪ���������������񣬾�һֱȥ����
        while(true){

            try {
                System.out.println("�������ѣ� " + blockingQueue.take());
                //����ֹͣһ�ᣬ���ڲ鿴Ч��
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}