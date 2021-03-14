/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author felipe_baumgartel
 */
public class Softwares {

    private int id;
    private String desenvolvedor;
    private double preco;
    private String descricao;
    private int quantidade;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Softwares other = (Softwares) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Softwares(int id, String desenvolvedor, double preco, String descricao, int quantidade) {
        this.id = id;
        this.desenvolvedor = desenvolvedor;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Softwares:\nId=" + id + "\nDesenvolvedor=" + desenvolvedor + "\nPreco=" + preco + "\nDescricao=" + descricao + "\nQuantidade=" + quantidade + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
