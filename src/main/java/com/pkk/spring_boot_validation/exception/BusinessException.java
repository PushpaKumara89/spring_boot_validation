package com.pkk.spring_boot_validation.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException{
    private final String msg;

    public static void main(String[] args) {

    }
}
