package com.masai.a7july_recycler_view_1_we1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private ArrayList<Student> studentList;

    public StudentAdapter(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Lloyd","onCreate view holder");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.setData(student);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}

