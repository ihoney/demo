package com.rainbow.cloud.client.kafka.partitioner;

/**
 * @version 0.0.1
 * @desc ProducerRecord需要的key参数，根据该值进行分区
 */
public interface KeyBuilder<E> {

    /**
     * 生成ProducerRecord需要的key参数
     * @param e log event, ch.qos.logback.classic.spi.ILoggingEvent
     * @return
     */
    byte[] build(E e);

}
