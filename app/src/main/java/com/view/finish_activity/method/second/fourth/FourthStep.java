package com.view.finish_activity.method.second.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.view.finish_activity.R;
import com.view.finish_activity.base.BaseActivity;

/**
 * Created by Administrator on 2018/1/31.
 */
public class FourthStep extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_step);

        initView();
        initReceiver();
    }

    private void initView() {
        Button btn_finish = (Button) findViewById(R.id.btn_finish);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendFinish();
            }
        });
    }

    private void sendFinish() {
        getApplicationContext().sendBroadcast(new Intent(INIENT_FINISH));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mRceiver);
    }
}
