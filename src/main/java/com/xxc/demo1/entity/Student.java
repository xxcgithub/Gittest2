package com.xxc.demo1.entity;

import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Data
@Valid
public class

Student {

    @Max(4)
    private String name;
    @NotBlank
    private Integer age;
}
