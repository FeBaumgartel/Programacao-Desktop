/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author felipe_baumgartel
 */
public class Endereco {
    private String CEP;
    private String rua;
    private String bairro;
    private String cidade;
    private String Complemento;
    private String Referencia;
    private int numero;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.CEP, other.CEP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CEP=" + CEP + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", Complemento=" + Complemento + ", Referencia=" + Referencia + ", numero=" + numero;
    }

    public Endereco(String CEP, String rua, String bairro, String cidade, String Complemento, String Referencia, int numero) {
        this.CEP = CEP;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.Complemento = Complemento;
        this.Referencia = Referencia;
        this.numero = numero;
    }

    public Endereco() {
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
        
}
