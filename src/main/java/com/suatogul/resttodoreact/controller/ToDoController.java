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
    public String getToDos(){
        return "working get";
    }
    @PostMapping(value = "/todo")
    public List<ToDo> addToDo(@RequestBody ToDo newTodo){
        List<ToDo> newToDo=todoService.addTodo(newTodo);
    return newToDo;
    }

    @DeleteMapping(value = "/todo")
    public String deleteToDo(){
        return "working delete";
    }

}
