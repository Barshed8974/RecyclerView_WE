package com.example.recyclewview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Student_Adapter_Class extends RecyclerView.Adapter<StudentViewHolder> {
    private ArrayList<Student> studentlist=new ArrayList<>();

    public Student_Adapter_Class(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student=studentlist.get(position);
        holder.setdata(student);
    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }
}
