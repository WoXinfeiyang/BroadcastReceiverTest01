#BroadcastReceiver测试例程

BroadcastReceiver广播接收器监听系统全局发送的广播，即接收程序所发送的广播，BroadcastReceiver是一个抽象类，首先需要定义一个BroadcastReceiver的实现子类并实现其中的onReceive方法，然后进行注册并指定BroadcastReceiver能够匹配的Intent。BroadcastReceiver有两种注册方式，一种是使用代码进行注册，一种方式是在AndroidManifest.xml中注册。

程序发送启动广播的步骤：

1、创建需要启动的BroadcastReceiver的Intent。

2、调用Context的sendBroadcast()或者sendOrderedBroadcast()方法来启动指定的BroadcastReceiver。                                                                                       

###运行结果图
#![](http://i.imgur.com/F22z01t.jpg)

#![](http://i.imgur.com/Lb2S3hw.jpg)

#![](http://i.imgur.com/KkyqO3B.jpg)