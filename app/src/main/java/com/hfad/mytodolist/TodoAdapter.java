package com.hfad.mytodolist;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoItemHolder> {

    List<Todo> data;

    public TodoAdapter(List<Todo> data){
        this.data = data;
    }

    @NonNull
    @Override
    public TodoItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item,parent,false);
        Log.i("afd", "a");
        return new TodoItemHolder(itemView);
    }

    //bind data vao viewHolder
    @Override
    public void onBindViewHolder(@NonNull TodoItemHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //view holder class
    public static class TodoItemHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public TodoItemHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.todo_name);
        }

        //bind data vao textView
        void bindData(Todo todo){
            textView.setText(todo.todoName);
            Log.i("afd", textView.getText().toString());
        }
    }
}
