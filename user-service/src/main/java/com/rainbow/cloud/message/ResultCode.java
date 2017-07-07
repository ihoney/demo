package com.rainbow.cloud.message;

/**
 * Created by caihongli on 2017/5/26.
 */
public interface ResultCode {

    /**
     * the status codes of per restful request.
     *
     * @return 20xxx if succeed, 40xxx if client error, 50xxx if server side crash.
     */
    int code();

    /**
     * @return status enum name
     */
    String name();

    /**
     * @return message summary
     */
    String message();

}
