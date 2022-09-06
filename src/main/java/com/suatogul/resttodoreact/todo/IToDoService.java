package com.suatogul.resttodoreact.todo;

import java.util.List;

public interface IToDoService {

    List<ToDo> findAll();
    List<ToDo> deleteProduct(String deleteId);

    List<ToDo> addProduct(ToDo newItem);
}
