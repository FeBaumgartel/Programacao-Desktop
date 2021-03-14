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
import model.Medico;

/**
 *
 * @author felipe_baumgartel
 */
public class MedicoDAO {
    private Conexao conexao;
    private Connection connection;
    
    public MedicoDAO(){
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }
    
    public void save(Medico medico) {
        //Instrução sql
        String sql = "Insert into medico(matricula,nome,telefone,dataNascimento,idade,formacao,"
                + "areaAtuacao) values(?,?,?,?,?,?,?)";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setInt(1,medico.getMatricula());
            pstmt.setString(2,medico.getNome());
            pstmt.setString(3,medico.getTelefone());
            pstmt.setInt(5,medico.getIdade());
            pstmt.setString(6,medico.getFormacao());
            pstmt.setString(7,medico.getAreaAtuacao());
            pstmt.setDate(4,Date.valueOf(medico.getDataNascimento()));
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Medico getById(long id) {
        String sql = "SELECT * FROM medico where matricula = "+id;
        Medico medico = new Medico();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);  
            
            while (res.next()) {
                medico.setMatricula(res.getInt("matricula"));
                medico.setNome(res.getString("nome"));
                medico.setTelefone(res.getString("telefone"));
                medico.setIdade(res.getInt("idade"));
                medico.setFormacao(res.getString("formacao"));
                medico.setAreaAtuacao(res.getString("areaAtuacao"));
                String aLD = String.valueOf(res.getDate("datanascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                medico.setDataNascimento(dataNascimento);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return medico;
    }

    public List<Medico> list() {
        String sql = "SELECT * FROM medico order by matricula asc";
        List<Medico> lista = new ArrayList<>();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);
            
             while (res.next()) {
                 Medico medico = new Medico();
                 
                medico.setMatricula(res.getInt("matricula"));
                medico.setNome(res.getString("nome"));
                medico.setTelefone(res.getString("telefone"));
                medico.setIdade(res.getInt("idade"));
                medico.setFormacao(res.getString("formacao"));
                medico.setAreaAtuacao(res.getString("areaAtuacao"));
                String aLD = String.valueOf(res.getDate("datanascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                medico.setDataNascimento(dataNascimento);
                lista.add(medico);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void remove(Medico medico) {
        String sql = "delete from medico where matricula = ?";
        PreparedStatement pstmt;
        try{
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parametros
            pstmt.setInt(1,medico.getMatricula());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    public void update(Medico medico) {
        String sql = "update medico set nome = ?,telefone = ?,dataNascimento = ?,idade = ?,formacao = ?, areaAtuacao = ? where matricula = ?";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setInt(7,medico.getMatricula());
            pstmt.setString(1,medico.getNome());
            pstmt.setString(2,medico.getTelefone());
            pstmt.setInt(4,medico.getIdade());
            pstmt.setString(5,medico.getFormacao());
            pstmt.setString(6,medico.getAreaAtuacao());
            pstmt.setDate(3,Date.valueOf(medico.getDataNascimento()));
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
