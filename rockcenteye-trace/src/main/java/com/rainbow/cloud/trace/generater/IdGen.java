package com.rainbow.cloud.trace.generater;

/**
 * ID生成器接口
 * Created by caihongli on 2017/7/6.
 */
public interface IdGen {

    /**
     * 生成下一个ID
     * @return
     */
    String nextId();
}
