/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.estacio.mei.dao;
import java.util.ArrayList;
import main.java.br.estacio.mei.vision.Produto;

/**
 
 * @author aluno
 */
public interface gerenciamentoDeProdutoDao {
    public ArrayList<Produto> buscarProduto();
    public Produto novoProduto (Produto produto);
    public boolean excluirProduto(Produto produto);  
}
