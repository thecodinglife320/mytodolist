package com.hfad.mytodolist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.hfad.mytodolist.databinding.FragmentTodoListBinding;

public class TodoListFragment extends Fragment {

    FragmentTodoListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentTodoListBinding.inflate(inflater, container, false);
        ViewGroup rootView = binding.getRoot();
        TodoListViewModel viewModel = new ViewModelProvider(this).get(TodoListViewModel.class);
        binding.todoList.setAdapter(new TodoAdapter(viewModel.data));

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
