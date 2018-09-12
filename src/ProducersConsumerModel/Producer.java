package ProducersConsumerModel;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private final BlockingQueue blockingQueue;
    //���ö��л���Ĵ�С�����������г��������С����ʱֹͣ����
    private final int QUEUE_SIZE = 10;


    public Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    int task = 1;
    @Override
    public void run() {

        while(true){
            try {
                System.out.println("����������" + task);
                //�����������Ĳ�Ʒ���ڶ��л�����
                blockingQueue.put(task);
                ++task;
                //����ֹͣһ�ᣬ���ڲ鿴Ч��
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}