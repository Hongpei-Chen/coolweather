package com.jeffchen.coolweather.util;

/**
 * Created by JeffChen on 2016/4/9.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
