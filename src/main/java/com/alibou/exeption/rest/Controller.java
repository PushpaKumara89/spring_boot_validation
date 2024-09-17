package com.alibou.exeption.rest;

import com.alibou.exeption.exception.BusinessException;
import com.alibou.exeption.domain.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @PostMapping("/validations")
    public ResponseEntity<String> validation(
            @RequestBody @Valid Student student
    ){
        return ResponseEntity.ok("valid request");
    }

    @PostMapping("/exception")
    public ResponseEntity<String> exception() throws BusinessException {
        if (true){
            throw new BusinessException("Exception is Business Error .....!");
        }
        return ResponseEntity.ok("No Exp");
    }


}
