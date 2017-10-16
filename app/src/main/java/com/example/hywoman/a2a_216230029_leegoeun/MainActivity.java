package com.example.hywoman.a2a_216230029_leegoeun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    메인 2 액티비티(개발자 정보)로 넘어가는 메소드
    public void nextScene1(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    //    메인 3 액티비티(본 내용)로 넘어가는 메소드
    public void nextScene2(View view) {
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }

    //    메인 4 액티비티(위젯 프래그먼트)로 넘어가는 메소드
    public void nextScene3(View view) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}
