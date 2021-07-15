package com.example.recyclewview2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mName;
    private TextView mAge;
    private TextView mRoll;
    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        initview(itemView);
    }
    public void initview(View itemview)
    {
        mName=itemview.findViewById(R.id.tvName);
        mAge=itemview.findViewById(R.id.tvAge);
        mRoll=itemview.findViewById(R.id.tvRollNo);
    }
    public void setdata(Student student)
    {
        mName.setText(student.getName());
        mAge.setText(student.getAge()+"");
        mRoll.setText(student.getRollNo());
    }
}
