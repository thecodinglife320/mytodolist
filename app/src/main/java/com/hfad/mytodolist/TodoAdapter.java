package com.hfad.mytodolist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoItemHolder> {

    List<Todo> data;

    @NonNull
    @Override
    public TodoItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return TodoItemHolder();
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    //view holder class
    public static class TodoItemHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public TodoItemHolder(@NonNull View itemView) {
            super(itemView);
//            textView = itemView.findViewById(R.id.)
        }


    }
}
