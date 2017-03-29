package com.example.palani.myloginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText et1, et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button1);
        t3 = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();

                if (s1.equals("admin") && s2.equals("admin")) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Userid/Password", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}