package com.fxj.broadcastreceivertest01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
	
	 private final String tag="MyBroadcastReceiver";
	 	
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String info="intent action:"+intent.getAction()+",\nÏûÏ¢ÄÚÈÝ:"+intent.getStringExtra("msg");
//		Log.i(info,"onReceive,"+info);
		System.out.println("onReceive,"+info);
		Toast.makeText(context,"onReceive,"+info,5000).show();
	}

}
