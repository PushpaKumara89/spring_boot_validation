package com.pkk.spring_boot_validation.rest;

import com.pkk.spring_boot_validation.domain.Student;
import com.pkk.spring_boot_validation.exception.BusinessException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @PostMapping("/validation")
    public ResponseEntity<String> validation(
            @RequestBody @Valid Student student
    ) {
        return ResponseEntity.ok("validated");
    }

    @PostMapping("/exception")
    public ResponseEntity<String> exception(
    ) {
        throw new BusinessException("this business level exception...");
    }
}
