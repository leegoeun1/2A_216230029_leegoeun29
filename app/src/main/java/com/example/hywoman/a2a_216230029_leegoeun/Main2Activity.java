package com.example.hywoman.a2a_216230029_leegoeun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("각종 계산기");

        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec classa = tabHost.newTabSpec("1").setContent(R.id.classa).setIndicator("반");
        TabHost.TabSpec name = tabHost.newTabSpec("2").setContent(R.id.name).setIndicator("이름");
        TabHost.TabSpec number = tabHost.newTabSpec("3").setContent(R.id.number).setIndicator("학번");

        tabHost.addTab(classa);
        tabHost.addTab(name);
        tabHost.addTab(number);
    }

}
