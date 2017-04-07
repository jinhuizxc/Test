package com.example.jh.test231;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 测试Android studio 2.3.1 版本发现与2.3不同的地方在于：
 * 1、classpath 'com.android.tools.build:gradle:2.3.1'
 * 2、compile 'com.android.support:appcompat-v7:25.3.1'
 * 3、compile 'com.android.support.constraint:constraint-layout:1.0.0-alpha7'
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
