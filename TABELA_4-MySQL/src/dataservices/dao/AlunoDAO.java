package dataservices.dao;

import dataservices.conexao.Conexao;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import domain.Aluno;
import domain.Sexo;

public class AlunoDAO implements IDAO<Aluno>{
    
    private Conexao conexao;
    private Connection connection;
    
    public AlunoDAO(){
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }
    
    public void save(Aluno aluno) {
        //Instrução sql
        String sql = "Insert into aluno(matricula,nome,cpf,sexo,email,endereco,"
                + "data_nascimento) values(?,?,?,?,?,?,?)";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setInt(1,aluno.getMatricula());
            pstmt.setString(2,aluno.getNome());
            pstmt.setLong(3,aluno.getCPF());
            pstmt.setString(4,String.valueOf(aluno.getSexo()));
            pstmt.setString(5,aluno.getEmail());
            pstmt.setString(6,aluno.getEndereco());
            pstmt.setDate(7,Date.valueOf(aluno.getDataNascimento()));
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Aluno getById(long id) {
        String sql = "SELECT * FROM aluno where matricula = "+id;
        Aluno aluno = new Aluno();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);  
            
            while (res.next()) {
                aluno.setMatricula(res.getInt("matricula"));
                aluno.setNome(res.getString("nome"));
                aluno.setCPF(res.getLong("cpf"));
                aluno.setSexo(Sexo.valueOf(res.getString("sexo")));
                aluno.setEmail(res.getString("email"));
                aluno.setEndereco(res.getString("endereco"));
                String aLD = String.valueOf(res.getDate("data_nascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                aluno.setDataNascimento(dataNascimento);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return aluno;
    }

    public List<Aluno> list() {
        String sql = "SELECT * FROM aluno order by matricula asc";
        List<Aluno> lista = new ArrayList<>();
        
        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery(sql);
            
             while (res.next()) {
                 Aluno aluno = new Aluno();
                 
                aluno.setMatricula(res.getInt("matricula"));
                aluno.setNome(res.getString("nome"));
                aluno.setCPF(res.getLong("cpf"));
                aluno.setSexo(Sexo.valueOf(res.getString("sexo")));
                aluno.setEmail(res.getString("email"));
                aluno.setEndereco(res.getString("endereco"));
                String aLD = String.valueOf(res.getDate("data_nascimento"));
                LocalDate dataNascimento = LocalDate.parse(aLD);
                aluno.setDataNascimento(dataNascimento);
                lista.add(aluno);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void remove(Aluno aluno) {
        String sql = "delete from aluno where matricula = ?";
        PreparedStatement pstmt;
        try{
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parametros
            pstmt.setLong(1,aluno.getMatricula());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    public void update(Aluno aluno) {
        String sql = "update aluno set nome = ?, cpf = ?, sexo = ?, email = ?, endereco = ?, data_nascimento = ? where matricula = ?";
        
        try{
            
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            //setar os parâmetros
            pstmt.setString(1,aluno.getNome());
            pstmt.setLong(2,aluno.getCPF());
            pstmt.setString(3,String.valueOf(aluno.getSexo()));
            pstmt.setString(4,aluno.getEmail());
            pstmt.setString(5,aluno.getEndereco());
            pstmt.setDate(6,Date.valueOf(aluno.getDataNascimento()));
            pstmt.setInt(7,aluno.getMatricula());
            pstmt.execute();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
