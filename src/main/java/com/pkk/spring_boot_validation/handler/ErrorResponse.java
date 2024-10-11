package com.pkk.spring_boot_validation.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {
}
