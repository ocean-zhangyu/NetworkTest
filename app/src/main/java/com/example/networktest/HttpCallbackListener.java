package com.example.networktest;

public interface HttpCallbackListener {
    void onFinish(String responseData);
    void onError(Exception e);
}
