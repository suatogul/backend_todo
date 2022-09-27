package com.suatogul.resttodoreact.controller;

import com.suatogul.resttodoreact.data.entity.Todo;
import com.suatogul.resttodoreact.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping(value = "/todo")
    public ResponseEntity<List<Todo>> getAllTodos(){
        try {
            List<Todo> allTodos=toDoService.getAllTodos();
            if(allTodos.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(allTodos,HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") long id){
        Optional<Todo> getTodo=toDoService.getByIdTodo(id);
        if(getTodo.isPresent()) {
            return new ResponseEntity<>(getTodo.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
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
    public ResponseEntity<Todo> deleteTodo(@PathVariable Long id){
        return toDoService.deleteTodo(id);
    }

    @DeleteMapping(value = "/todo")
    public ResponseEntity<Todo> deleteAllTodo(){
        return toDoService.deleteAllTodos();
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> updateSelectedTodo(@PathVariable("id") long id,@RequestBody Todo todo){
        ResponseEntity<Todo> updatedTodo=toDoService.updateTodo(id,todo);
        return updatedTodo;
    }
    @GetMapping("/todo/done")
    public ResponseEntity<List<Todo>> findByDone(){
        return toDoService.findDoneTodos();
    }

}
