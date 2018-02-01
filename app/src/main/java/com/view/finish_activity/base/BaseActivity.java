package com.view.finish_activity.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.view.finish_activity.utils.StackManager;

/**
 * Email 2185134304@qq.com
 * Created by JackChen on 2018/1/31.
 * Version 1.0
 * Description:
 */
public class BaseActivity extends Activity {

    //用于广播的标志
    public final static String INIENT_FINISH = "com.allfinish.method.finish";

    //用于startActivityForResult()的标志
    public final static int FINISH_REQUESTCODE = 1;
    public final static int FINISH_RESULTCODE = 1;



    public StackManager mStackManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    /**
     * 注册广播
     */
    public void initReceiver(){
        IntentFilter filter = new IntentFilter() ;
        filter.addAction(INIENT_FINISH);
        registerReceiver(mRceiver , filter) ;
    }


    /**
     * 初始化广播接收者
     */
    public BroadcastReceiver mRceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (INIENT_FINISH.equals(intent.getAction())){
                finish();
            }
        }
    } ;


    /**
     * 用于startActivityForResult()
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FINISH_REQUESTCODE){
            if (resultCode == FINISH_RESULTCODE){
                setResult(FINISH_REQUESTCODE);
                finish();
            }
        }
    }
}
