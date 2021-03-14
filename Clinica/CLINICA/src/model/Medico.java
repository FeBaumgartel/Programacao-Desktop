/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dataservices.dao.MedicoDAO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class Medico {

    private int Matricula;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private int idade;
    private String formacao;
    private String areaAtuacao;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medico other = (Medico) obj;
        if (this.Matricula != other.Matricula) {
            return false;
        }
        return true;
    }

    public Medico() {
    }

    public Medico(int Matricula, String nome, String telefone, LocalDate dataNascimento, int idade, String formacao, String areaAtuacao) {
        this.Matricula = Matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Matricula=" + Matricula + ", nome=" + nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    MedicoDAO dao = new MedicoDAO();

    public boolean verificarExistenciaDeMedico(Medico a) {
        List<Medico> lista = dao.list();

        for (int i = 0; i < lista.size(); i++) {
            if (a.equals(lista.get(i))) {
                return true;
            }
        }
        return false;
    }
}
