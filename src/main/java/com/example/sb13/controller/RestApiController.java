package com.example.sb13.controller;

import com.example.sb13.model.Todo;
import com.example.sb13.service.TodoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*")
@Tag(name = "Todo")
public class RestApiController {
    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> getTodoList(){
        return todoService.findAll(10);
    }

    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodo(@PathVariable(name = "id") Long id){
        return todoService.findById(id);
    }

    @PostMapping("/todo")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        todoService.add(todo);
        return ResponseEntity.ok().body(todo);
    }

    @PutMapping("/todo/{id}")
    public  ResponseEntity<Todo> editTodo(@PathVariable(name = "id") Long id,@RequestBody Todo todo){
        todoService.add(todo);
        return ResponseEntity.ok().body(todo);
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<Todo> deleteTodo(@PathVariable(name = "id") Long id){
        todoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
