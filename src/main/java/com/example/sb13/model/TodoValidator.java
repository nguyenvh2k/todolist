package com.example.sb13.model;

import org.thymeleaf.util.StringUtils;

import javax.swing.text.html.Option;
import java.util.Optional;

public class TodoValidator {
    /**
     * Kiem tra xem mot object Todo co hop le khong
     * @param todo
     * @return
     */
    public boolean isValid(Todo todo){
        return Optional.ofNullable(todo).filter(t-> !StringUtils.isEmpty(t.getTitle()))
                .filter(t->!StringUtils.isEmpty(t.getDetail()))
                .isPresent();//tra ve tru neu hop le ,nguoc lai false
    }
}
