package com.example.recyclewview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentlist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }
    public void buildStudentList()
    {
        for(int i=0;i<29;i++)
        {
            Student student=new Student("abc"+i,22,"reg"+(101+i));
            studentlist.add(student);
        }

    }
    public void initviews()
    {
        recyclerView=findViewById(R.id.recycler1);
    }
    public void setRecyclerView()
    {
        Student_Adapter_Class student_adapter_class=new Student_Adapter_Class(studentlist);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(student_adapter_class);
    }
}