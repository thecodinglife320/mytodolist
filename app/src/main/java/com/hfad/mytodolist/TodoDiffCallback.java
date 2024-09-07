package com.hfad.mytodolist;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class TodoDiffCallback extends DiffUtil.ItemCallback<Todo> {
    @Override
    public boolean areItemsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
        return oldItem==newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
        return oldItem.todoName.equals(newItem.todoName);
    }
}
