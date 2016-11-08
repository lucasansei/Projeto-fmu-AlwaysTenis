/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author prouni
 */
public class ProdutoTable {
    String modelo, cor, tipo, marca, preco_unitario;
    int tamanho, quantidade; 

public ProdutoTable(){
        
}

public ProdutoTable(String modelo, String cor, String tipo, int tamanho,int  quantidade, String preco_unitario){
    this.modelo         = modelo;
    this.cor            = cor;
    this.tipo           = tipo;
    this.tamanho        = tamanho;
    this.quantidade     = quantidade;
    this.preco_unitario = preco_unitario;
}

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getPreco_unitario() {
        return preco_unitario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco_unitario(String preco_unitario) {
        this.preco_unitario = preco_unitar