package com.example.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button1;
    private Button button2;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editTextid);
        button1=(Button)findViewById(R.id.buttonid1);
        button2=(Button)findViewById(R.id.button2);
        textView1=(TextView)findViewById(R.id.resultid1);
        textView2=(TextView)findViewById(R.id.resultid2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier1=39.37;
                double result1=0.0;

                if(editText.getText().toString().equals("")){

                    textView1.setText(R.string.error_message);
                    textView1.setTextColor(Color.RED);
                }else {
                    double metervalue = Double.parseDouble(editText.getText().toString());
                    textView1.setTextColor(Color.DKGRAY);
                    result1 = metervalue * multiplier1;
                    textView1.setText(String.format("%.2f", result1) + "inches");
                }

            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier2=3.28;
                double result2=0.0;
                if(editText.getText().toString().equals("")){
                    textView2.setText(R.string.error_message);
                    textView2.setTextColor(Color.RED);

                }else {
                    double feetvalue = Double.parseDouble(editText.getText().toString());
                    result2 = feetvalue * multiplier2;
                    textView2.setTextColor(Color.DKGRAY);
                    textView2.setText(Double.toString(result2) + "feets");
                }
            }
        });
    }
}
