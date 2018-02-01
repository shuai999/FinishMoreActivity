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
public class FourthStep extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_step);

        initView() ;
    }

    private void initView() {
        Button btn_next_step = (Button) findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(FINISH_RESULTCODE);  //结果码
                finish();
            }
        });
    }
}
