/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author felipe_baumgartel
 */
public class Aula {
    private int id;
    private Professor professor;
    private Aluno aluno;
    private String disciplina;
    private LocalDate dataAula;

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aula other = (Aula) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", professor=" + professor + ", aluno=" + aluno + ", disciplina=" + disciplina + ", dataAula=" + dataAula + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public LocalDate getDataAula() {
        return dataAula;
    }

    public void setDataAula(LocalDate dataAula) {
        this.dataAula = dataAula;
    }

    public Aula() {
    }

    public Aula(int id, Professor professor, Aluno aluno, String disciplina, LocalDate dataAula) {
        this.id = id;
        this.professor = professor;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.dataAula = dataAula;
    }

}
