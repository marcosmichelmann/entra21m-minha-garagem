/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.CategoriaDAO;
import database.Conexao;
import database.Utilitarios;
import model.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CategoriaDAOJunitTest {
    
    
    
    @Test
    public void bucarPorId() {
        Conexao.truncate();
        Categoria categoria = new Categoria();
        categoria.setNome("Média");
        categoria.setDescricao("Meu texto");
        categoria.setAtivo(false);
        int codigoInserido = new CategoriaDAO().inserir(categoria);
        categoria.setId(codigoInserido);
        
        Categoria categoriaBuscada = new CategoriaDAO().buscarCategoriaPorId(codigoInserido);
        assertNotNull(categoriaBuscada);
        assertEquals(categoria.getId(), categoriaBuscada.getId());
        assertEquals(categoria.getNome(), categoriaBuscada.getNome());
        assertEquals(categoria.getDescricao(), categoriaBuscada.getDescricao());
        assertEquals(categoria.isAtivo(), categoriaBuscada.isAtivo());
    }
    
    @Test
    public void inserir(){
        Conexao.truncate();
        Categoria categoria = new Categoria();
        categoria.setNome("Média");
        categoria.setDescricao("Meu texto");
        categoria.setAtivo(false);
        int codigoInserido = new CategoriaDAO().inserir(categoria);
        assertEquals(1, codigoInserido);
    }
    
    @Test
    public void alterar(){
        Conexao.truncate();
        Categoria categoria = new Categoria();
        categoria.setNome("Média");
        categoria.setDescricao("Meu texto");
        categoria.setAtivo(false);
        int codigoInserido = new CategoriaDAO().inserir(categoria);
        categoria.setId(codigoInserido);
        
        categoria.setNome("Alta");
        categoria.setDescricao("Meu texto 2");
        categoria.setAtivo(true);
        int codigoAlterar = new CategoriaDAO().alterar(categoria);
        assertNotSame(Utilitarios.NAO_FOI_POSSIVEL_ALTERAR, codigoAlterar);
        
        Categoria categoriaBuscada = new CategoriaDAO().buscarCategoriaPorId(categoria.getId());
        
        assertEquals(categoria.getId(), categoriaBuscada.getId());
        assertEquals(categoria.getNome(), categoriaBuscada.getNome());
        assertEquals(categoria.getDescricao(), categoriaBuscada.getDescricao());
        assertEquals(categoria.isAtivo(), categoriaBuscada.isAtivo());        
        
    }
    
    @Test
    public void excluir(){}
}
