package com.suatogul.resttodoreact.controller;

import com.suatogul.resttodoreact.data.entity.Todo;
import com.suatogul.resttodoreact.data.repository.ITodoRepository;
import com.suatogul.resttodoreact.service.ToDoService;
import com.suatogul.resttodoreact.todo.IToDoService;
import com.suatogul.resttodoreact.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ToDoController {

    @Autowired
    ToDoService toDoService;


    @GetMapping(value = "/todo")
    public List<ToDo> getToDos(){
//        List<ToDo> allTodos=todoService.getAllTodos();
        return null;
    }
    @PostMapping(value = "/todo")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
        try{
            Todo _todo=toDoService.createTodo(todo);
            return new ResponseEntity<>(_todo, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/todo/{id}")
    public List<ToDo>  deleteToDo(@PathVariable String id){
        String deletedId=id;
//        List<ToDo> deletedTodo=todoService.deleteTodo(deletedId);
        return null;
    }

}
