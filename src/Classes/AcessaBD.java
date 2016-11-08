/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author 8101728
 */
public class AcessaBD {
      Connection conexao;
    Statement stmt;
    ResultSet rs;
  
    // metodo para conexão com o banco de dados
    public  Connection getConnection() throws ClassNotFoundException, SQLException{
       
     //  Class.forName("org.apache.derby.jdbc.InternalDriver.class");
         Class.forName("com.mysql.jdbc.Driver");

          conexao = DriverManager.getConnection( "jdbc:mysql://localhost:3306/AlwaysTenis","root","");
          return conexao;
    }
     // metodo para gravar os dados do cliente
    public  void gravarDadosCliente(ClienteTable cliente) throws ClassNotFoundException, SQLException{
    String sql;
    conexao= getConnection();
    stmt=conexao.createStatement();
    sql= "INSERT INTO alwaysTenis.cliente(nome, cpf, telefone, celular, email) VALUES('" +cliente.getNome()+"','"
            + cliente.getCpf()+"','" +cliente.getTelefone()+"','"+cliente.getCelular()+"','" + cliente.getEmail()+"')";
    
    stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, " Dados do Cliente gravados com sucesso!!!");
    }
    
    public  void gravarDadosProduto(ProdutoTable produto) throws ClassNotFoundException, SQLException{
    String sql;
    conexao= getConnection();
    stmt=conexao.createStatement();
    sql= "INSERT INTO alwaysTenis.produto(tipo, modelo, tamanho, cor, marca, quantidade, preco) VALUES('"
            + produto.getTipo()+"','" 
            + produto.getModelo()+"',"
            + produto.getTamanho()+",'" 
            + produto.getCor()+"','"
            + produto.getMarca()+"',"
            + produto.getQuantidade()+",'"
            + produto.getPreco_unitario()+"')";
    
    stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, " Dados do Produto gravados com sucesso!!!");
    }
    
    public ProdutoTable buscarProdutoCodigo(int codigo) throws ClassNotFoundException, SQLException{
    
        String sql;
        ProdutoTable pro = new ProdutoTable();
     
        conexao = getConnection();
        stmt    = conexao.createStatement();
        sql     = "select * from alwaysTenis.produto where idproduto ="+codigo+"";
        rs      = stmt.executeQuery(sql);
        
        while (rs.next()) {
            pro.setTipo(rs.getString(2));
            pro.setMarca(rs.getString(3));
            pro.setModelo(rs.getString(4)); 
            pro.setTamanho(Integer.parseInt(rs.getString(5)));
            pro.setQuantidade(Integer.parseInt(rs.getString(6)));
            pro.setPreco_unitario(rs.getString(7));
            pro.setCor(rs.getString(8));
        }
  
    return pro;
    }
    
    public ClienteTable buscarClienteCpf(String codigo) throws ClassNotFoundException, SQLException{
        String sql;
        ClienteTable cli = new ClienteTable();
     
        conexao = getConnection();
        stmt    = conexao.createStatement();
        sql     = "select * from alwaysTenis.cliente where cpf ="+codigo+"";
        rs      = stmt.executeQuery(sql);
        
        while (rs.next()) {
            cli.setNome(rs.getString(2));
            cli.setTelefone(rs.getString(3)); 
            cli.setCelular(rs.getString(4));
            cli.setEmail(rs.getString(5));
        }
  
    return cli;
    }
    
    public void excluirProdutoCodigo(int codigo) throws ClassNotFoundException, SQLException{
        String sql;
        conexao = getConnection();
        stmt    = conexao.createStatement();

        sql="DELETE FROM alwaysTenis.produto WHERE idproduto ="+codigo+"";
        if(stmt.executeUpdate(sql)>0) {
          JOptionPane.showMessageDialog(null, "Produto excluido.");
        }
    }
    
    public void excluirClienteCpf(String codigo) throws ClassNotFoundException, SQLException{
        String sql;
        conexao = getConnection();
        stmt    = conexao.createStatement();

        sql="DELETE FROM alwaysTenis.cliente WHERE cpf ="+codigo+"";
        if(stmt.executeUpdate(sql)>0) {
          JOptionPane.showMessageDialog(null, "Cliente excluido.");
        }
    }
    
    public void alterarProdutoCodigo(int codigo, ProdutoTable produto) throws ClassNotFoundExcep