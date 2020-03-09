package com.example.admissionappgdg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Choose extends AppCompatActivity {

    TextView hello;
    Button fillForm, viewAdmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        hello =(TextView)findViewById(R.id.hello);
        String s = getIntent().getStringExtra("name");
        hello.setText(hello.getText() + " " + s);

        //button fill form
        fillForm = (Button) findViewById(R.id.fillForm);
        fillForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choose.this, FillForm.class);
                startActivity(i);
            }
        });

        //button view Admission
        viewAdmission = (Button) findViewById(R.id.viewAdmission);
        viewAdmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Choose.this, ViewAdmission.class);
                startActivity(j);
            }
        });
    }
}
