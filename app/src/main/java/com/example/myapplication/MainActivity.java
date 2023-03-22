package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button convert;
    private TextView textView2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert= findViewById(R.id.convert);
        textView2=findViewById(R.id.textView2);// adding the value here
        editText= findViewById(R.id.editText);//getting value from here to calculate
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted Successfully", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                int kg= Integer.parseInt(s);
                double pound= kg*2.20462;
                textView2.setText(kg+" kg  in Pound = "+pound);
            }
        });

    }
}