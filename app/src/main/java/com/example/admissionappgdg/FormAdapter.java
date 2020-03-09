package com.example.admissionappgdg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FormAdapter extends RecyclerView.Adapter<FormAdapter.FormViewHolder> {

    ArrayList<GDGForm> gdgFormList;
    Context context;

    public FormAdapter(ArrayList<GDGForm>formList){

        gdgFormList = formList;
        GDGForm g =
                new GDGForm("Tj","It looks cool","CSE",
                        "XR",20,true);
        gdgFormList.add(g);
    }

    class FormViewHolder extends  RecyclerView.ViewHolder{
        TextView name, subBranch, skill;
        public FormViewHolder( View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.nameTV);
            subBranch = (TextView)itemView.findViewById(R.id.branchTV);
            skill = (TextView)itemView.findViewById(R.id.skillTV);
        }
    }

    @Override
    public FormViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new FormViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FormViewHolder holder, int position) {
        GDGForm gf = gdgFormList.get(position);
        holder.name.setText(gf.name+", "+gf.age);
        holder.subBranch.setText(gf.subBranch);
        holder.skill.setText(gf.skill);
    }

    @Override
    public int getItemCount() {
        return gdgFormList.size();
    }

}
