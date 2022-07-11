package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotEmpty(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-z]*", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;

    @NotNull(message = "A nota não pode estar vazia.")
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "10.0")
    Double score;
}
