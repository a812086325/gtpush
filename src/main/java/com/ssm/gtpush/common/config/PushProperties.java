package com.ssm.gtpush.common.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PushProperties {   
    private static String appId;   
    private static String appKey;   
    private static String masterSecret;
    private static String host;   
  
    static {   
        Properties prop = new Properties();   
        try {   
        	InputStream in =  PushProperties.class.getClassLoader().getResourceAsStream("pushconfig.properties"); 
            prop.load(in);   
            appId = prop.getProperty("config.appId").trim();   
            appKey = prop.getProperty("config.appKey").trim();   
            masterSecret = prop.getProperty("config.masterSecret").trim();   
            host = prop.getProperty("config.host").trim();   
        } catch (IOException e) {   
            e.printStackTrace();   
        }   
    }   
  
    /**  
     * 私有构造方法，不需要创建对象  
     */   
    private PushProperties() {   
    }   
  
    public static String getAppId() {
		return appId;
	}


	public static void setAppId(String appId) {
		PushProperties.appId = appId;
	}


	public static String getAppKey() {
		return appKey;
	}

	public static void setAppKey(String appKey) {
		PushProperties.appKey = appKey;
	}


	public static String getMasterSecret() {
		return masterSecret;
	}


	public static void setMasterSecret(String masterSecret) {
		PushProperties.masterSecret = masterSecret;
	}

	public static String getHost() {
		return host;
	}

	public static void setHost(String host) {
		PushProperties.host = host;
	}

}  