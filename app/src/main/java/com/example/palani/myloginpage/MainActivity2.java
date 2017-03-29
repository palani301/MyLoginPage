package com.example.palani.myloginpage;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Palani on 29-03-2017.
 */

public class MainActivity2 extends MainActivity {

        TextView text;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activity2);
            text=(TextView)findViewById(R.id.textView);
        }

    }


