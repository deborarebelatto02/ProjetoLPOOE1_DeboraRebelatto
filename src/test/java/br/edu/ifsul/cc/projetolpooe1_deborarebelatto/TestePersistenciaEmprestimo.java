/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.projetolpooe1_deborarebelatto;

import br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.PersistenciaJPA;
import br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.model.Emprestimo;
import br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.model.Leitor;
import br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.model.Livro;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author debor
 */
public class TestePersistenciaEmprestimo {

    PersistenciaJPA jpa = new PersistenciaJPA();

    public TestePersistenciaEmprestimo() {

    }

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void teste() throws Exception {
        Livro livro = new Livro();
        livro.setTitulo("Java para Iniciantes");
        livro.setAutor("Autor Desconhecido");
        livro.setIsbn("1234567890123");

        Leitor leitor = new Leitor();
        leitor.setNome("João Silva");
        leitor.setEmail("joao.silva@example.com");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo(new Date());
        emprestimo.setDataDevolucao(new Date());
        emprestimo.setLivro(livro);
        emprestimo.setLeitor(leitor);
        
        jpa.persist(livro);
        jpa.persist(leitor);
        jpa.persist(emprestimo);
    }
}
