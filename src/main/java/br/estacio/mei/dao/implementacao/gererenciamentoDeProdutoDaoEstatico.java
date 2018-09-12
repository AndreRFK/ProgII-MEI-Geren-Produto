/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.estacio.mei.dao.implementacao;
import java.util.ArrayList;
import main.java.br.estacio.mei.vision.Produto;

/**
 *
 * @author aluno
 */
    public class gererenciamentoDeProdutoDaoEstatico {
    ArrayList<Produto> bancoDeDados = new ArrayList();

    public ArrayList<Produto> buscarProduto() {
        return bancoDeDados;
    }
    public Produto novoProduto(Produto produto) {
        bancoDeDados.add(produto);
        return produto;
    }
     public boolean excluirProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

