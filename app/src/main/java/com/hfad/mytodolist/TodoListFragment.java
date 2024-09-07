package com.hfad.mytodolist;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.hfad.mytodolist.databinding.FragmentTodoListBinding;

public class TodoListFragment extends Fragment {

    FragmentTodoListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflate layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_todo_list,container, false);
        View rootView = binding.getRoot();

        //set viewmodel
        TodoListViewModel viewModel = new ViewModelProvider(this).get(TodoListViewModel.class);
        
        //set adapter for recyclerview
        TodoAdapter adapter = new TodoAdapter(new TodoDiffCallback());
        binding.todoList.setAdapter(adapter);

        viewModel.data.observe(getViewLifecycleOwner(), todos -> {
            Log.d("observer", "ff10");
            adapter.submitList(todos);
        });

        //set databinding variable
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        binding.saveButton.setOnClickListener(view -> {
            viewModel.addTodo();
            binding.taskName.getText().clear();

        });

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}


