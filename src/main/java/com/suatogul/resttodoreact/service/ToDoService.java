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

        return todoList;
    }

    @Override
    public List<ToDo> addTodo(ToDo newTodo) {
    todoList.add(new ToDo(newTodo.getTodoName()));
        return todoList;
    }

    @Override
    public List<ToDo> deleteTodo(String deleteId) {
        ArrayList<ToDo> deletedItem=new ArrayList<ToDo>();
        deletedItem.clear();
        String testUuid="";
            for(int i=0;i<todoList.size();i++){
                    if(todoList.get(i).getUuid().toString().equals(deleteId)){
                        deletedItem.add(todoList.get(i));
                        todoList.clear();
                        break;
                    }

            }
//        String testUuid=todoList.get(0).getUuid().toString();
        return deletedItem;
    }


}
