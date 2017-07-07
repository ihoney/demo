package com.rainbow.cloud.client.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import java.util.Map;

/**
 * 实现KafkaProducer的加载
 * Created by caihongli on 2017/7/6.
 */
public class SingletonProducer {

    private static volatile Producer<byte[], String> producer;

    /**
     * 私有化构造方法
     */
    private SingletonProducer() {

    }

    /**
     * 实例化
     * @param config
     * @return
     */
    public static Producer<byte[], String> getInstance(Map<String, Object> config) {
        if (producer == null) {
            synchronized(SingletonProducer.class) {
                if (producer == null) {
                    producer = new KafkaProducer<byte[], String>(config);
                }
            }
        }
        return producer;
    }

    /**
     * 是否初始化
     * @return
     */
    public static boolean isInstanced() {
        return producer != null;
    }

}
