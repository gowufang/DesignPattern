package ProducersConsumerModel;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 生产者消费者模式
 * 使用阻塞队列BlockingQueue
 * @author wanggenshen
 *
 */
public class TestConPro {



    public static void main(String[] args){
        BlockingQueue blockingQueue = new LinkedBlockingQueue(5);

        Producer p = new Producer(blockingQueue);
        Consumer c = new Consumer(blockingQueue);

        Thread tp = new Thread(p);
        Thread tc= new Thread(c);

        tp.start();
        tc.start();

    }


}