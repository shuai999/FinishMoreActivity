package com.view.finish_activity.method.second;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.view.finish_activity.R;
import com.view.finish_activity.base.BaseActivity;

/**
 * Created by Administrator on 2018/1/31.
 */
public class FirstStep extends BaseActivity {

    private Button btn_next_step;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_step);

        initView() ;
        mStackManager.getStackManager().pushActivity(this); //把Activity添加到栈中
    }

    private void initView() {
        btn_next_step = (Button) findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstStep.this , SecondStep.class));
            }
        });

    }
}
