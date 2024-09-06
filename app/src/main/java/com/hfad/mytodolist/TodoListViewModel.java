package com.hfad.mytodolist;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TodoListViewModel extends ViewModel {

    List<Todo> data = new ArrayList<>();

    public TodoListViewModel(){
        data.add(new Todo("do home work"));
        data.add(new Todo("write love letter"));
        data.add(new Todo("water plant"));
    }

    void setData() {

    }
}
