package com.example.win.layoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent=new Intent(this,Linear_Activity.class);
        btn=findViewById(R.id.eight);
        btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
               startActivity(intent);
               }
        }

        );
    }
}
