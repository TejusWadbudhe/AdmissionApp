package com.example.admissionappgdg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ViewAdmission extends AppCompatActivity{

    ArrayList<GDGForm> gfList;
    FormAdapter fadapter;
    RecyclerView formRCV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_admission);
        gfList = new ArrayList<GDGForm>();
        GDGForm gf = (GDGForm) getIntent().getSerializableExtra("form");
        gfList.add(gf); // add the object into the list
        fadapter = new FormAdapter(gfList);
        formRCV = (RecyclerView)findViewById(R.id.formRecyclerView);
        formRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        formRCV.setAdapter(fadapter);
        fadapter.notifyDataSetChanged();
        
    }
    public  void setGlist(ArrayList<GDGForm> gFList){
        gfList=gFList;
    }

}
