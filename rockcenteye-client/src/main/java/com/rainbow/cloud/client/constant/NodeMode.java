package com.rainbow.cloud.client.constant;

import com.rainbow.cloud.base.constant.Constants;

/**
 * @version 0.0.1
 * @desc 节点性质
 * @date 2016-09-21 15:47:17
 */
public enum NodeMode {

    EPHEMERAL("EPHEMERAL", Constants.ROOT_PATH_EPHEMERAL),
    PERSISTENT("PERSISTENT", Constants.ROOT_PATH_PERSISTENT);

    private String symbol;

    private String label;

    private NodeMode(String symbol, String label) {
        this.symbol = symbol;
        this.label = label;
    }

    public String symbol() {
        return this.symbol;
    }

    public String label() {
        return this.label;
    }

}
