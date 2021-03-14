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
public class Pecas {

    private int id;
    private String marca;
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
        final Pecas other = (Pecas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Pecas(int id, String marca, double preco, String descricao, int quantidade) {
        this.id = id;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pecas:\nId=" + id + "\nMarca=" + marca + "\nPreco=" + preco + "\nDescricao=" + descricao + "\nQuantidade=" + quantidade + '}';
    }

    public Pecas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
