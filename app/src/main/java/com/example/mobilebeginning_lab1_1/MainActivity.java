package com.example.mobilebeginning_lab1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        tv = (TextView)findViewById(R.id.textView2);

    }

    public void onClick(View v)
    {
        if(v.getId() == R.id.button)
        {
            String sprice = e1.getText().toString();
            String scount= e2.getText().toString();
            int price = Integer.parseInt(sprice);
            int count = Integer.parseInt(scount);
            int sum = price * count;
            tv.setText("가격은 "+sum+"원 입니다");
        }
    }
}
