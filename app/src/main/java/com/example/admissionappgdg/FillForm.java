package com.example.admissionappgdg;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FillForm extends AppCompatActivity {

    Button submitBtn;
    EditText nameEdt, whyET;
    Spinner skillSpn;
    SeekBar ageSB;
    CheckBox consentCB;
    RadioButton cseRB, itRB, ecRB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fill_form);

//Initialising
        nameEdt = (EditText) findViewById(R.id.nameEdt);
        submitBtn = (Button)findViewById(R.id.submitBtn);
        skillSpn = (Spinner)findViewById(R.id.skillSpn);
        cseRB = (RadioButton)findViewById(R.id.cseRB);
        itRB = (RadioButton)findViewById(R.id.itRB);
        ecRB = (RadioButton)findViewById(R.id.ecRB);
        whyET =(EditText) findViewById(R.id.whyET);
        ageSB=(SeekBar)findViewById(R.id.ageSB);
        consentCB = (CheckBox)findViewById(R.id.consentCB);

//Submit Button
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = nameEdt.getText().toString();
                String whyPara = whyET.getText().toString();
                String skill = skillSpn.getSelectedItem().toString();
                String subBranch = null;
                if(cseRB.isChecked()){
                    subBranch = "CSE";
                }

                if(itRB.isChecked()){
                    subBranch = "IT";
                }

                if(ecRB.isChecked()){
                    subBranch = "EC";
                }

                int age = ageSB.getProgress();
                boolean isAgree = consentCB.isChecked();

                GDGForm gf = new GDGForm(name,subBranch,skill,whyPara,age,isAgree);

                Intent i = new Intent(FillForm.this, ViewAdmission.class);
                i.putExtra("feedback" , gf);
                startActivity(i);
            }
        });
    }
}
