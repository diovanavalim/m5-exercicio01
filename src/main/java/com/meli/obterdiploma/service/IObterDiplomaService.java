package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;

import javax.validation.Valid;

public interface IObterDiplomaService {

    public StudentDTO analyzeScores(@Valid StudentDTO rq);
}