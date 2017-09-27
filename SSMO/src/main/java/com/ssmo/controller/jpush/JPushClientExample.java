/*package com.ssmo.controller.jpush;

import java.util.HashMap;
import java.util.Map;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

public class JPushClientExample {
	//在极光注册上传应用的 appKey 和 masterSecret  
	protected static final String APP_KEY ="045b59396a5de9f3bd730df6";
    protected static final String MASTER_SECRET = "bd34540dc9d528accff80717";  
    public static final String ALERT = "Test from API Example - alert";
    public static final String TITLE = "Test from API Example";
     
     * 保存离线的时长。秒为单位。最多支持10天（864000秒）。 
     * 0 表示该消息不保存离线。即：用户在线马上发出，当前不在线用户将不会收到此消息。 
     * 此参数不设置则表示默认，默认为保存1天的离线消息（86400秒 
      
    //private static int timeToLive =  60 * 60 * 24;
    
    public static void main(String[] args) {
    	 
         * Example1: 初始化,默认发送给android和ios，同时设置离线消息存活时间 
         * jpush = new JPushClient(masterSecret, appKey, timeToLive); 
         *  
         * Example2: 只发送给android         *  
         * Example3: 只发送给IOS 
         * jpush = new JPushClient(masterSecret, appKey, DeviceEnum.IOS); 
         *  
         * Example4: 只发送给android,同时设置离线消息存活时间 
         * jpush = new JPushClient(masterSecret, appKey, timeToLive, DeviceEnum.Android); 
           
    	  
        
        
  
        //测试发送消息或者通知
        testSend();
	}
    
    public static  void testSend() {
    	// 在实际业务中，建议 sendNo 是一个你自己的业务可以处理的一个自增数字。  
        // 除非需要覆盖，请确保不要重复使用。详情请参考 API 文档相关说明。
    	String sendNo="1900192560";  
        String msgTitle = "JPush测试信息";  
        String msgContent = "我是JPush测试信息，已经成功发送给你，请查收。";
         
         * IOS设备扩展参数, 
         * 设置badge，设置声音 
           
        //Map<String, Object> extra = new HashMap<String, Object>();  
        //IOSExtra iosExtra = new IOSExtra(1, "WindowsLogonSound.wav");  
        //extra.put("id1",iosExtra);  
        //extra.put("id2","I am extra infomation");  
        //IOS和安卓一起
        //MessageResult msgResult = jpush.sendNotificationWithAppKey(sendNo, msgTitle, msgContent, 0, extra);
        ClientConfig clientConfig = ClientConfig.getInstance();
    	final JPushClient jpush = new JPushClient(APP_KEY, MASTER_SECRET, null, clientConfig);
    	final PushPayload pushPayload = buildPushObject_android_and_ios();
        System.out.println(pushPayload.toString());
        try {
			jpush.sendPush(pushPayload);
			//System.out.println(pushResult);
		} catch (APIConnectionException e) {
			
			e.printStackTrace();
		} catch (APIRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getErrorCode());
			System.out.println(e.getStatus());
			System.out.println(e.getErrorMessage());
			System.out.println(e.getMsgId());
			
		}
        //对所有用户发送通知, 更多方法请参考文档
    //  MessageResult msgResult = jpush.sendCustomMessageWithAppKey(sendNo,msgTitle, msgContent);  
        if (null != msgResult) {  
            System.out.println("服务器返回数据: " + msgResult.toString());  
            if (msgResult.getErrcode() == ErrorCodeEnum.NOERROR.value()) {  
                System.out.println("发送成功， sendNo=" + msgResult.getSendno());  
            } else {  
                System.out.println("发送失败， 错误代码=" + msgResult.getErrcode() + ", 错误消息=" + msgResult.getErrmsg());  
            }  
        } else {  
            System.out.println("无法获取数据");  
        }  
    	
    	
    }
    
    public static final int MAX = Integer.MAX_VALUE;  
    public static final int MIN = (int) MAX/2;
    
    *//** 
     * 保持 sendNo 的唯一性是有必要的 
     * It is very important to keep sendNo unique. 
     * @return sendNo 
     *//*  
    public static int getRandomSendNo() {  
        return (int) (MIN + Math.random() * (MAX - MIN));  
    }
    
    public static PushPayload buildPushObject_all_all_alert() {
        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.android(ALERT, "Test from API example", null))
                .build();
    }
    
    public static PushPayload buildPushObject_android_tag_alertWithTitle() {  
        return PushPayload.newBuilder()  
                .setPlatform(Platform.android())  
                .setAudience(Audience.all())  
                .setNotification(Notification.android(ALERT, TITLE, null))  
                .build();  
    }
    
    public static PushPayload buildPushObject_android_and_ios() {
        Map<String, String> extras = new HashMap<String, String>();
        extras.put("test", "https://community.jiguang.cn/push");
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                		.setAlert(ALERT)
                		.addPlatformNotification(AndroidNotification.newBuilder()
                				.setTitle(TITLE)
                                .addExtras(extras).build())
                		.build())
                .build();
    }
    
}
*/