package com.edu.taruc.bmi_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText height;
    private EditText weight;
    private TextView result;

    //Intent i = new Intent(this, secondActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        weight = (EditText) findViewById(R.id.weightETM);
        height = (EditText) findViewById(R.id.heightETM);
        TextView textView = (TextView) findViewById(R.id.resultView);
        String bmiValue = textView.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("bmi", bmiValue);
        //i.putExtras(bundle);
        //startActivity(i);
    }

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        float bmi = 0.0f;

        if (heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr);
            float weightValue = Float.parseFloat(weightStr);

            bmi = weightValue / (heightValue * heightValue);
        }


    }
}
