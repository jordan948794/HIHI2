package com.example.student.hihi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HIHI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hihi);
    }
    public void myfun(View btnView){

        EditText et=(EditText) findViewById(R.id.editText2);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText(et.getText());
    }
}
