package com.rainbow.cloud.client.util;

import com.rainbow.cloud.base.constant.Constants;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by caihongli on 2017/7/6.
 */
public class SysUtil {

    public static String host = Constants.EMPTY_STR;
    public static String userDir = Constants.EMPTY_STR;

    static {
        if (System.getenv("COMPUTERNAME") != null) {
            host = System.getenv("COMPUTERNAME");
        } else {
            try {
                host = (InetAddress.getLocalHost()).getHostName();
            } catch (UnknownHostException uhe) {
                String host = uhe.getMessage();
                if (host != null) {
                    int colon = host.indexOf(':');
                    if (colon > 0) {
                        host = host.substring(0, colon);
                    }
                }
                host = "UnknownHost";
            }
        }

        userDir = System.getProperty("user.dir", "<NA>");
    }

}
