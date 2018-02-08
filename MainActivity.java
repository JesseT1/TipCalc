package com.example.jesse.tipcalculator_jesse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView value;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioGroup rdoGroupTips;
    EditText total;
    EditText people;
    EditText tipAmount;
    Button calculate;

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putInt("num", Integer.valueOf(value.getText().toString()));
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //savedNum = (savedInstanceState.getInt("num"));
        //value.setText(Integer.toString(savedNum));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = (EditText) findViewById(R.id.TotalAmount);
        people = (EditText) findViewById(R.id.PeopleAmount);
        calculate = (Button) findViewById(R.id.done);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount = Double.parseDouble(total.getText().toString());
                double tipTotal;
                tipTotal = Double.parseDouble(tipAmount.getText().toString());
            }
        });
    }

    public void checkButton(View view){
        int radioID = radioGroup.getCheckedRadioButtonId()
        radioButton = findViewById(radioID);

    }
}
