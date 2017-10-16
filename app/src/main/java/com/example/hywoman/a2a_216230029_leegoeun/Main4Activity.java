package com.example.hywoman.a2a_216230029_leegoeun;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2, bt3;
    FragmentManager fm;
    FragmentTransaction tran;
    firstFragment frame_first;
    secondFragment frame_second;
    thirdFragment frame_third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        frame_first = new firstFragment(); //프래그먼트 객채셍성
        frame_second = new secondFragment(); //프래그먼트 객채셍성
        frame_third = new thirdFragment(); //프래그먼트 객채셍성
        setFrag(0); //프래그먼트 교체
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                setFrag(0);
                break;
            case R.id.bt2:
                setFrag(1);
                break;
            case R.id.bt3:
                setFrag(2);
                break;
        }
    }

    public void setFrag(int n) {    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
        fm = getFragmentManager();
        tran = fm.beginTransaction();
        switch (n) {
            case 0:
                tran.replace(R.id.main_frame, frame_first);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
            case 1:
                tran.replace(R.id.main_frame, frame_second);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
            case 2:
                tran.replace(R.id.main_frame, frame_third);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
        }
    }
}
