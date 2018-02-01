package com.view.finish_activity.method.second.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.view.finish_activity.MainActivity;
import com.view.finish_activity.R;
import com.view.finish_activity.base.BaseActivity;

/**
 * Created by Administrator on 2018/1/31.
 */
public class FourthStep extends BaseActivity {

    private Button btn_next_step;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_step);

        initView() ;
    }

    private void initView() {
        btn_next_step = (Button) findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthStep.this , MainActivity.class) ;
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
                startActivity(intent);

            }
        });
    }
}
