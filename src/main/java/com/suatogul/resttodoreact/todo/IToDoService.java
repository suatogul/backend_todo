package com.suatogul.resttodoreact.todo;

import java.util.List;

public interface IToDoService {

    List<ToDo> getAllTodos();
    List<ToDo> addTodo(ToDo newItem);
    List<ToDo> deleteTodo(String deleteId);


}
