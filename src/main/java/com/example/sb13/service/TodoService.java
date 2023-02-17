package com.example.sb13.service;

import com.example.sb13.model.Todo;
import com.example.sb13.model.TodoValidator;
import com.example.sb13.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoValidator todoValidator;
    /**
     * Lay danh sach list todo
     */
    public List<Todo> findAll(Integer limit){
        return Optional.ofNullable(limit)
                .map(value->todoRepository.findAll(PageRequest.of(0,value)).getContent())
                .orElseGet(()->todoRepository.findAll());
    }

    public Optional<Todo> findById(Long id){
        return todoRepository.findById(id);
    }
    /**
     * Them mot todo moi vao danh sach cong viec can lam
     *
     */
    public Todo add(Todo todo){
        if (todoValidator.isValid(todo)){
            return todoRepository.save(todo);
        }
        return null;
    }
    //delete todo
    public void delete(Long id){
        todoRepository.deleteById(id);
    }
}
