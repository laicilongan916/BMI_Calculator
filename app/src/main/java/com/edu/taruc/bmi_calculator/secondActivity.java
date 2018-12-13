package com.edu.taruc.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    Bundle bundle = getIntent().getExtras();

    String stuff = bundle.getString("stuff");

    //String value = (TextView) findViewById(R.id.resultView);


}
