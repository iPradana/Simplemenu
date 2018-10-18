package com.team67.simplemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnM;
    String m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnmenu1(View view){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void btnmenu2(View view){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
    public void btnmenux(View view){
        Intent i = new Intent(this, Main4Activity.class);
        btnM = (Button) findViewById(view.getId());
        m = btnM.getText().toString();
        i.putExtra("menu",m);
        startActivity(i);
    }
}
