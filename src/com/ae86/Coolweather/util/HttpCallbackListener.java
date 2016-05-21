package com.ae86.Coolweather.util;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
