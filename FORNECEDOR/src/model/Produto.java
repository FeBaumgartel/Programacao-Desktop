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
public class Produto {

    private int id;
    private int quantidade;
    private String nome;
    private String descricao;
    private String validade;
    private String lote;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Produto(int id, int quantidade, String nome, String descricao, String validade, String lote) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
        this.lote = lote;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", quantidade=" + quantidade + ", nome=" + nome + ", descricao=" + descricao + ", validade=" + validade + ", lote=" + lote + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
