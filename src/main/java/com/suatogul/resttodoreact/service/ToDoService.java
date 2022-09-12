package com.suatogul.resttodoreact.service;

import com.suatogul.resttodoreact.data.entity.Todo;
import com.suatogul.resttodoreact.data.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ToDoService {
    @Autowired
    ITodoRepository todoRepository;

    public List<Todo> getAllTodos(){
        List<Todo> todos;
        todos=todoRepository.findAll();
        return todos;
    }
    public Todo createTodo(Todo todo){
    Todo _todo=todoRepository.save(new Todo(todo.getTodoText(),false));
        return _todo;
    }

    public ResponseEntity<Todo> deleteTodo(Long id){
//        Why do I need to write Todo inside the brackets ResponseEntity<Todo> as long as I am not returning an object
        try{
                todoRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

        public ResponseEntity<Todo> updateTodo(Long id, Todo todo ){
            Optional<Todo> updateTodo=todoRepository.findById(id);
            if (updateTodo.isPresent()){
                Todo _todo=updateTodo.get();
                _todo.setTodoText(todo.getTodoText());
                _todo.setDone(todo.isDone());
                return new ResponseEntity<>(todoRepository.save(_todo),HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        public ResponseEntity<List<Todo>> findDoneTodos(){
        try{
            List<Todo> doneTodos=todoRepository.findByDone(true);
            if (doneTodos.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(doneTodos,HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
