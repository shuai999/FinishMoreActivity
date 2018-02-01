package com.view.finish_activity.method.second.third;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.view.finish_activity.R;
import com.view.finish_activity.app.AppApplication;
import com.view.finish_activity.base.BaseActivity;

/**
 * Created by Administrator on 2018/1/31.
 */
public class SecondStep extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_step);


        initView() ;

        AppApplication.getApp().addActivity(this);   //把Activity添加到集合中
    }

    private void initView() {
        Button btn_next_step = (Button) findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondStep.this , ThirdStep.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppApplication.getApp().clearActivity();  //清除list集合
    }
}
