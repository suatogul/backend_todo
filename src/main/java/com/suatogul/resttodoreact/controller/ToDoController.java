package com.suatogul.resttodoreact.controller;

import com.suatogul.resttodoreact.service.ToDoService;
import com.suatogul.resttodoreact.todo.IToDoService;
import com.suatogul.resttodoreact.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private IToDoService todoService;

    @GetMapping(value = "/todo")
    public List<ToDo> getToDos(){
        List<ToDo> allTodos=todoService.getAllTodos();
        return allTodos;
    }
    @PostMapping(value = "/todo")
    public List<ToDo> addToDo(@RequestBody ToDo newTodo){
        List<ToDo> newToDo=todoService.addTodo(newTodo);
    return newToDo;
    }

    @DeleteMapping(value = "/todo/{id}")
    public List<ToDo>  deleteToDo(@PathVariable String id){
        String deletedId=id;
        List<ToDo> deletedTodo=todoService.deleteTodo(deletedId);
        return deletedTodo;
    }

}
