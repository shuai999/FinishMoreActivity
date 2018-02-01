package com.view.finish_activity.method.second.fifth;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_step);

        initView() ;
    }

    private void initView() {
        Button btn_next_step = (Button) findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstStep.this , SecondStep.class) , FINISH_REQUESTCODE);
            }
        });
    }
}
