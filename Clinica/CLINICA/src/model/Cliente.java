/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dataservices.dao.ClienteDAO;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class Cliente {

    private int ID;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String celular;
    private String tipo_sanguineo;
    private int idade;
    private LocalDate dataNascimento;
    private String alergias;
    private String observacao;
//    private Endereco endereco;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", nome=" + nome;
    }

    public Cliente() {
    }

    public Cliente(int ID, String nome, String cpf, String rg, String telefone, String celular, String tipo_sanguineo, int idade, LocalDate dataNascimento, String alergias, String observacao/*, Endereco endereco*/) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.tipo_sanguineo = tipo_sanguineo;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.observacao = observacao;
//        this.endereco = endereco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }

    public boolean verificarExistenciaDeCliente(Cliente a) {
        List<Cliente> lista = dao.list();

        for (int i = 0; i < lista.size(); i++) {
            if (a.equals(lista.get(i))) {
                return true;
            }
        }
        return false;
    }
    ClienteDAO dao = new ClienteDAO();
}
