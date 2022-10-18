package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

}
