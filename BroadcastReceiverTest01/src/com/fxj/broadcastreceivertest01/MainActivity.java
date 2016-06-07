package com.fxj.broadcastreceivertest01;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * 文件名称:BroadcastReceiver测试例程
 * 时间：2016-6-7 17:01
 * 说明：1、BroadcastReceiver广播接收器监听系统全局发送的广播，即接收程序所发送的广播，
 * BroadcastReceiver是一个抽象类，首先需要定义一个BroadcastReceiver的实现子类
 * 并实现其中的onReceive方法，然后进行注册并指定BroadcastReceiver能够匹配的Intent。
 * BroadcastReceiver有两种注册方式，一种是使用代码进行注册，一种方式是在AndroidManifest.xml中注册。
 * 程序发送启动广播的步骤：
 * 1、创建需要启动的BroadcastReceiver的Intent。
 * 2、调用Context的sendBroadcast()或者sendOrderedBroadcast()方法来启动指定的BroadcastReceiver。
 * */

public class MainActivity extends Activity {

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.button=(Button) findViewById(R.id.button);
		this.button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setAction(MyConstants.MyBroadcastReceiverAction);
				intent.putExtra("msg","来自应用程序发送的广播消息!");
				sendBroadcast(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
