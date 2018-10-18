package com.team67.simplemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String menu;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv1 = (TextView) findViewById(R.id.tv1);
        Bundle extras = getIntent().getExtras();
        menu = extras.getString("menu");
        tv1.setText(menu);
    }
}
