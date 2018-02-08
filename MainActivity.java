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
    RadioButton radioTwelve;
    RadioButton radioFifteen;
    RadioButton radioEighteen;
    RadioButton radioCustom;
    RadioGroup rdoGroupTips;
    EditText total;
    EditText people;
    EditText tipAmount;
    Button calculate;
    Double money;
    Double finalA;


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
        radioTwelve = (RadioButton) findViewById(R.id.Twelve);
        radioFifteen = (RadioButton) findViewById(R.id.Fifteen);
        radioEighteen = (RadioButton) findViewById(R.id.Eighteen);
        radioCustom = (RadioButton) findViewById(R.id.Custom);
        money = Double.parseDouble(total.getText().toString();
        people = (EditText) findViewById(R.id.PeopleAmount);
        calculate = (Button) findViewById(R.id.done);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == radioTwelve.getId()){
                    finalA = (money * .10) / 100;
                    total.setText("$" + finalA.toString());
                }
                if(view.getId() == radioFifteen.getId()){
                    finalA = (money * .15) / 100;
                    total.setText("$" + finalA.toString());
                }
                if(view.getId() == radioEighteen.getId()){
                    finalA = (money * .18) / 100;
                    total.setText("$" + finalA.toString());
                }
                if(view.getId() == radioCustom.getId()){
                    finalA = (money * .10) / 100;
                    total.setText("$" + finalA.toString());
                }
            }
        });
    }

    public void checkButton(View view){
        int radioID = radioGroup.getCheckedRadioButtonId()
        radioButton = findViewById(radioID);

    }
}
