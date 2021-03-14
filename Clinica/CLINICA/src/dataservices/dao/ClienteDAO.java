/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

/**
 *
 * @author felipe_baumgartel
 */
public class ClienteDAO {
    private Conexao conexao;
    private Connection connection;
    
    public ClienteDAO(){
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }
    
    public void save(Cliente cliente) {
        //Instrução sql
        String sql = "Insert into cliente(id_cliente,nome,cpf,rg,telefone,celular,"
                + "tipo_sanguineo,idade,datanascimento,alergias,observacoes) values(?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setInt(1,cliente.getID());
            pstmt.setString(2,cliente.getNome());
            pstmt.setString(3,cliente.getCpf());
            pstmt.setString(4,cliente.getRg());
            pstmt.setString(5,cliente.getTelefone());
            pstmt.setString(6,cliente.getCelular());
            pstmt.setString(7,cliente.getTipo_sanguineo());
            pstmt.setInt(8,cliente.getIdade());
            pstmt.setDate(9,Date.valueOf(cliente.getDataNascimento()));
            pstmt.setString(10,cliente.getAlergias());
            pstmt.setString(11,cliente.getObservacao());
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente getById(long id) {
        String sql = "SELECT * FROM cliente where id_cliente = "+id;
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);  
            
            while (res.next()) {
                cliente.setID(res.getInt("id_cliente"));
                cliente.setNome(res.getString("nome"));
                cliente.setCpf(res.getString("cpf"));
                cliente.setRg(res.getString("rg"));
                cliente.setTelefone(res.getString("telefone"));
                cliente.setCelular(res.getString("celular"));
                String aLD = String.valueOf(res.getDate("data_nascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                cliente.setDataNascimento(dataNascimento);
                cliente.setTipo_sanguineo(res.getString("tipo_sanguineo"));
                cliente.setIdade(res.getInt("idade"));
                cliente.setAlergias(res.getString("alergias"));
                cliente.setObservacao(res.getString("observacoes"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return cliente;
    }

    public List<Cliente> list() {
        String sql = "SELECT * FROM cliente order by id_cliente asc";
        List<Cliente> lista = new ArrayList<>();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);
            
             while (res.next()) {
                 Cliente cliente = new Cliente();
                 
                cliente.setID(res.getInt("id_cliente"));
                cliente.setNome(res.getString("nome"));
                cliente.setCpf(res.getString("cpf"));
                cliente.setRg(res.getString("rg"));
                cliente.setTelefone(res.getString("telefone"));
                cliente.setCelular(res.getString("celular"));
                String aLD = String.valueOf(res.getDate("datanascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                cliente.setDataNascimento(dataNascimento);
                cliente.setTipo_sanguineo(res.getString("tipo_sanguineo"));
                cliente.setIdade(res.getInt("idade"));
                cliente.setAlergias(res.getString("alergias"));
                cliente.setObservacao(res.getString("observacoes"));
                lista.add(cliente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void remove(Cliente cliente) {
        String sql = "delete from cliente where id_cliente = ?";
        PreparedStatement pstmt;
        try{
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parametros
            pstmt.setLong(1,cliente.getID());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    public void update(Cliente cliente) {
        String sql = "update cliente set nome = ?,cpf = ?,rg = ?,telefone = ?,celular = ?,"
                + "tipo_sanguineo = ?,idade = ?,datanascimento = ?,alergias = ?,observacoes = ? where id_cliente = ?";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setInt(12,cliente.getID());
            pstmt.setString(1,cliente.getNome());
            pstmt.setString(2,cliente.getCpf());
            pstmt.setString(3,cliente.getRg());
            pstmt.setString(4,cliente.getTelefone());
            pstmt.setString(5,cliente.getCelular());
            pstmt.setString(6,cliente.getTipo_sanguineo());
            pstmt.setInt(7,cliente.getIdade());
            pstmt.setDate(8,Date.valueOf(cliente.getDataNascimento()));
            pstmt.setString(9,cliente.getAlergias());
            pstmt.setString(10,cliente.getObservacao());
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
