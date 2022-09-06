package com.suatogul.resttodoreact.controller;

import com.suatogul.resttodoreact.todo.IToDoService;
import com.suatogul.resttodoreact.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String addToDo(){
    return "working";
    }

    @DeleteMapping(value = "/todo")
    public String deleteToDo(){
        return "working delete";
    }

}
