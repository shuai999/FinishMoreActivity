package com.view.finish_activity.app;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;

/**
 * Email 2185134304@qq.com
 * Created by JackChen on 2018/1/31.
 * Version 1.0
 * Description:
 */
public class AppApplication extends Application {
	private static AppApplication mAppApplication;
	/** ��ǰ�򿪵�activity�б� */
	public ArrayList<Activity> activityList;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mAppApplication = this;
	}

	/** ��ȡApplication */
	public static AppApplication getApp() {
		if (mAppApplication == null) {
			mAppApplication = new AppApplication();
		}
		return mAppApplication;
	}

	/** 给集合添加activity */
	public void addActivity(Activity acitivity) {
		if(activityList == null){
			activityList = new ArrayList<Activity>();
		}
		activityList.add(acitivity);
	}
	
	/** 从集合移除activity */
	public void clearActivity(){
		activityList.clear();
	}

	/** 遍历集合，清除集合所有的activity */
	public void exit() {
		for (Activity activity : activityList) {
			activity.finish();
		}
		clearActivity();//ǧ��ǵ����ȡ�����á�
		System.exit(0);
	}
}
