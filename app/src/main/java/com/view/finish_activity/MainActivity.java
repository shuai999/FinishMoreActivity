package com.view.finish_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.view.finish_activity.base.BaseActivity;
import com.view.finish_activity.method.second.FirstStep;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    public Button btn_method_first;
    public Button btn_method_second;
    public Button btn_method_third;
    public Button btn_method_fourth;
    public Button btn_method_fifth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView() ;
    }

    private void initView() {
        btn_method_first = (Button) findViewById(R.id.btn_method_first);
        btn_method_second = (Button) findViewById(R.id.btn_method_second);
        btn_method_third = (Button) findViewById(R.id.btn_method_third);
        btn_method_fourth = (Button) findViewById(R.id.btn_method_fourth);
        btn_method_fifth = (Button) findViewById(R.id.btn_method_fifth);
        btn_method_first.setOnClickListener(this);
        btn_method_second.setOnClickListener(this);
        btn_method_third.setOnClickListener(this);
        btn_method_fourth.setOnClickListener(this);
        btn_method_fifth.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_method_first: //采用FLAG_ACTIVITY_CLEAR_TOP退出整个程序
//                startActivity(new Intent(INTENT_METHOD_FIRST_SINGUP));
                startActivity(new Intent(MainActivity.this , FirstStep.class));
                break;
            case R.id.btn_method_second://通过堆栈管理器去管理
//                startActivity(new Intent(INTENT_METHOD_SECOND_SINGUP));
                startActivity(new Intent(MainActivity.this , FirstStep.class));
                break;
            case R.id.btn_method_third://全局记录打开的Activity或通过一个自定义的类去管理打开的Activity
//                startActivity(new Intent(INTENT_METHOD_THIRD_SINGUP));
                startActivity(new Intent(MainActivity.this , FirstStep.class));
                break;
            case R.id.btn_method_fourth://使用广播机制解决
//                startActivity(new Intent(INTENT_METHOD_FOURTH_SINGUP));
                startActivity(new Intent(MainActivity.this , FirstStep.class));
                break;
            case R.id.btn_method_fifth://通过Activity跳转中传递requestCode的之后根据onActivityResult来遍历关闭
//                startActivity(new Intent(INTENT_METHOD_FIFTH_SINGUP));
                startActivity(new Intent(MainActivity.this , FirstStep.class));
                break;
            default:
                break;
        }
    }
}
