package com.ssm.gtpush.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ssm.gtpush.common.GtPushUtils;

public class GtPushUtilsTest {

	private final String CID = "ee772899e1062ee94ae0659aaad8a30a";
	private final String CIDIOS = "a013261806f8947e87b39b1632d30ae0";
	private final String ALIAS = "android__12345";
	private final String ISO_ALIAS = "ios_12345";

	// @Test
	public void pushMessageToAllAndroid() {
		GtPushUtils.pushMessageToAllAndroid("所有", "发Android所有设备的信息", "http://www.baidu.com");
	}
	
	// @Test
	public void pushMessageToAllIOS() {
		GtPushUtils.pushMessageToAllIOS("所有", "发IOS所有设备的信息", "http://www.baidu.com");
	}

	@Test
	public void pushMessageToSingleAndroid() {
		String title = "Android";
		String text = "这是一条来自后台的测试";
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("type", "toUserCenter");
		customContent.put("id", "78");
		GtPushUtils.pushMessageToSingleAndroid(CID, title, text, customContent);
	}
	
	//@Test
	public void pushMessageToSingleIOS() {
		String title = "IOS";
		String text = "测试";
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("type", "toUserCenter");
		customContent.put("id", "31665");
		GtPushUtils.pushMessageToSingleIOS(CIDIOS, title, text, customContent);
	}

	// @Test
	public void pushMessageToListAndroid() {
		String title = "Android List";
		String text = "测试";
		List<String> cids = new ArrayList<String>();
		cids.add(CID);
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("message", "这个好呀");
		customContent.put("pushMessageToListAndroid", "list");
		GtPushUtils.pushMessageToListAndroid(cids, title, text, customContent);
	}

	// @Test
	public void pushMessageToListIOS() {
		String title = "IOS List";
		String text = "测试";
		List<String> cids = new ArrayList<String>();
		cids.add(CID);
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("message", "多个用户透传信息");
		customContent.put("pushMessageToListIOS", "list");
		GtPushUtils.pushMessageToListIOS(cids, title, text, customContent);
	}
	
	// @Test
	public void pushMessageToSingleAliasIOS(){
		
		String title = "ecom1";
		String text = "电商别名测试";
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("type", "orderId");
		customContent.put("id", "1111");
		GtPushUtils.pushMessageToSingleAliasIOS(ISO_ALIAS , title, text, customContent);

	}
	
	// @Test
	public void pushMessageToSingleAliasAndroid(){
		
		String title = "ecom1";
		String text = "电商别名测试";
		Map<String, Object> customContent = new HashMap<String, Object>();
		customContent.put("type", "orderId");
		customContent.put("id", "1111");
		GtPushUtils.pushMessageToSingleAliasAndroid(ALIAS , title, text, customContent);

	}


}
