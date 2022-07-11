package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    String message;

    Double averageScore;

    @NotEmpty(message = "O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-z]*", message = "O nome do aluno deve começar com letra maiúscula.")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 50 caracteres.")
    String studentName;

    @NotEmpty(message = "A lista não pode estar vazia.")
    List<SubjectDTO> subjects;

}
