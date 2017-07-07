package com.rainbow.cloud.base.constant;

/**
 * Created by caihongli on 2017/7/6.
 */
public enum RpcType {

    none(Constants.RPC_TYPE_NONE, "none"),
    dubbo(Constants.RPC_TYPE_DUBBO, "dubbo"),
    thrift(Constants.RPC_TYPE_THRIFT, "thrift");

    private String symbol;

    private String label;

    private RpcType(String symbol, String label) {
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
