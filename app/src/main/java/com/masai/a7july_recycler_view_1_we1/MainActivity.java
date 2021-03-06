package com.masai.a7july_recycler_view_1_we1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();

        Student student1 = new Student("Anush", 21, "EMP123");
        studentList.add(student1);

        Student student2 = new Student("Niraj", 22, "EMP124");
        studentList.add(student2);

        Student student3 = new Student("Amey", 23, "EMP123");
        studentList.add(student3);

        for (int i = 0; i < 15; i++) {
            Student student = new Student("Avadhut", 24, "EMP101");
            studentList.add(student);
        }

        Student student4 = new Student("Dev", 23, "EMP124");
        studentList.add(student4);
    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

}