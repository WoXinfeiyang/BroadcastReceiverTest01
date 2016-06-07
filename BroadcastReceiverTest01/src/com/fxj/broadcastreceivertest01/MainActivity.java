package com.fxj.broadcastreceivertest01;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * �ļ�����:BroadcastReceiver��������
 * ʱ�䣺2016-6-7 17:01
 * ˵����1��BroadcastReceiver�㲥����������ϵͳȫ�ַ��͵Ĺ㲥�������ճ��������͵Ĺ㲥��
 * BroadcastReceiver��һ�������࣬������Ҫ����һ��BroadcastReceiver��ʵ������
 * ��ʵ�����е�onReceive������Ȼ�����ע�Ტָ��BroadcastReceiver�ܹ�ƥ���Intent��
 * BroadcastReceiver������ע�᷽ʽ��һ����ʹ�ô������ע�ᣬһ�ַ�ʽ����AndroidManifest.xml��ע�ᡣ
 * �����������㲥�Ĳ��裺
 * 1��������Ҫ������BroadcastReceiver��Intent��
 * 2������Context��sendBroadcast()����sendOrderedBroadcast()����������ָ����BroadcastReceiver��
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
				intent.putExtra("msg","����Ӧ�ó����͵Ĺ㲥��Ϣ!");
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
