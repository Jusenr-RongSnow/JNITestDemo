package com.myself.jnitestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String express = "葡萄科技";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sample_text = (TextView) findViewById(R.id.sample_text);
        TextView tv_text = (TextView) findViewById(R.id.tv_text);
        TextView tv_add = (TextView) findViewById(R.id.tv_add);
        TextView tv_int = (TextView) findViewById(R.id.tv_int);
        TextView tv_number = (TextView) findViewById(R.id.tv_number);
        TextView tv_msg = (TextView) findViewById(R.id.tv_msg);
        TextView tv_jiami = (TextView) findViewById(R.id.tv_jiami);

        JniTest jniTest = new JniTest();
        sample_text.setText(jniTest.stringFromJNI());
        tv_text.setText(jniTest.getAcquisitionTime());
        float add = jniTest.getTwoNumbersAnd(5f, 12f);
        tv_add.setText(String.valueOf(add));
        int a = jniTest.getA();
        tv_int.setText(String.valueOf("a=" + a));
        tv_number.setText(String.valueOf("number= " + jniTest.getStringFromNative()));
        tv_msg.setText(jniTest.getMessage().getData().toString());
        String s = jniTest.getTheCiphertext(express);
        tv_jiami.setText(String.valueOf("密文：" + s));
    }
}
