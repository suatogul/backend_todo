package com.suatogul.resttodoreact.service;

import com.suatogul.resttodoreact.data.entity.Todo;
import com.suatogul.resttodoreact.data.repository.ITodoRepository;
import com.suatogul.resttodoreact.todo.IToDoService;
import com.suatogul.resttodoreact.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ToDoService {

    @Autowired
    ITodoRepository todoRepository;

//    private IToDoService todoService;

    public Todo createTodo(Todo todo){
    Todo _todo=todoRepository.save(new Todo(todo.getTodoText(),false));
        return _todo;
    }




//======================
//    ArrayList<ToDo> todoList=new ArrayList<ToDo>();
//
//    @Override
//    public List<ToDo> getAllTodos() {
//
//        return todoList;
//    }
//
//    @Override
//    public List<ToDo> addTodo(ToDo newTodo) {
////        if(newTodo.getTodoName().trim()!=""){
////            todoList.add(new ToDo(newTodo.getTodoName().trim()));
////        }
//        return null;
//    }
//
//    @Override
//    public List<ToDo> deleteTodo(String deleteId) {
//        ArrayList<ToDo> deletedItem=new ArrayList<ToDo>();
//        deletedItem.clear();
//        String testUuid="";
//            for(int i=0;i<todoList.size();i++){
//                    if(todoList.get(i).getUuid().toString().equals(deleteId)){
//                        deletedItem.add(todoList.get(i));
//                        todoList.remove(i);
//                        break;
//                    }
//
//            }
////        String testUuid=todoList.get(0).getUuid().toString();
//        return null;
//    }


}
