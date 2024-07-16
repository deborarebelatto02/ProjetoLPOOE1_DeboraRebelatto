/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.projetolpooe1_deborarebelatto;

import br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author debor
 */
public class TestePersistencia {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("Conectado ao BD");
        } else {
            System.err.println("Erro ao conectar ao banco");
        }
    }
}
