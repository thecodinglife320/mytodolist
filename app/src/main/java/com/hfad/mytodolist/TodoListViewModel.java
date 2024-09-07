package com.hfad.mytodolist;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TodoListViewModel extends ViewModel {

    MutableLiveData<List<Todo>> data = new MutableLiveData<>(new ArrayList<>()) ;
    public MutableLiveData<String> todoName= new MutableLiveData<>("");

    public TodoListViewModel(){
        data.getValue().add(new Todo("do home work"));
        data.getValue().add(new Todo("write love letter"));
        data.getValue().add(new Todo("water plant"));
    }

    void addTodo(){
        Log.d("viewmodel",todoName.getValue());
        List<Todo> current = new ArrayList<>(data.getValue());
        current.add(new Todo(todoName.getValue()));
        data.setValue(current);
    }

}
