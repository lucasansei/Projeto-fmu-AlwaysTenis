/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//import org.apache.derby.client.am.DateTime;

/**
 *
 * @author Adriana
 */
public class VendasTable {
    String cpf,formapague, data;
    int idproduto, quantidade,idfuncionario;
    float precoUni;
    

    
    public VendasTable(){
        
    }
    
    public VendasTable(String cpf, String formapague, int idproduto, int quantidade, float precoUni, int idfuncionario, String data){
      this.cpf=cpf;
      this.idproduto=idproduto;
      this.quantidade=quantidade;
      this.precoUni=precoUni;
      this.data=data;
      this.idfuncionario=idfuncionario;
      this.formapague=formapague;
        
             
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFormapague() {
        return formapague;
    }

    public void setFormapague(String formapague) {
        this.formapague = formapague;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(float precoUni) {
        this.precoUni = precoUni;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
    
}