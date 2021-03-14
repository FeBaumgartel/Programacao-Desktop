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
public class Consulta {
    private int ID;
    private Medico Medico;
    private Cliente Cliente;
    private LocalDate dataConsulta;
    private String listaMedicamentos;
    private String observacoes;

    @Override
    public String toString() {
        return "ID=" + ID + ", Medico=" + Medico + ", Cliente=" + Cliente + ", dataConsulta=" + dataConsulta + ", listaMedicamentos=" + listaMedicamentos + ", observacoes=" + observacoes;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consulta other = (Consulta) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    public Consulta() {
    }

    public Consulta(int ID, Medico Medico, Cliente Cliente, LocalDate dataConsulta, String listaMedicamentos, String observacoes) {
        this.ID = ID;
        this.Medico = Medico;
        this.Cliente = Cliente;
        this.dataConsulta = dataConsulta;
        this.listaMedicamentos = listaMedicamentos;
        this.observacoes = observacoes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico Medico) {
        this.Medico = Medico;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(String listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
