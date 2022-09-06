package com.suatogul.resttodoreact.service;

import com.suatogul.resttodoreact.todo.IToDoService;
import com.suatogul.resttodoreact.todo.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ToDoService implements IToDoService {

    private IToDoService todoService;

    ArrayList<ToDo> todoList=new ArrayList<ToDo>();

    @Override
    public List<ToDo> getAllTodos() {
        return null;
    }

    @Override
    public List<ToDo> addTodo(ToDo newTodo) {
    todoList.add(new ToDo(newTodo.getTodoName()));
        return todoList;
    }

    @Override
    public List<ToDo> deleteTodo(String deleteId) {
        return null;
    }


}
