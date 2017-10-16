package com.example.hywoman.a2a_216230029_leegoeun;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2017-10-16.
 */

public class TextFragMent extends Fragment {

    private static TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // 이 프래그먼트의 레이아웃을 인플레이트 하다.
        View view = inflater.inflate(R.layout.text_fragment, container, false);

        textview = (TextView) view.findViewById(R.id.textView1);

        return view;
    }
    public void changeTextProperties (int fontsize, String text) {
        textview.setTextSize(fontsize);
        textview.setText(text);
    }
}
