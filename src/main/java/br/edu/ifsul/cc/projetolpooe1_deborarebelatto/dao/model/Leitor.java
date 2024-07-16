/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.projetolpooe1_deborarebelatto.dao.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author debor
 */
@Entity
@Table(name = "tb_leitor")
public class Leitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @OneToMany(mappedBy = "leitor")
    private List<Livro> livrosFavoritos;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosFavoritos() {
        return livrosFavoritos;
    }

    public void setLivrosFavoritos(List<Livro> livrosFavoritos) {
        this.livrosFavoritos = livrosFavoritos;
    }
}
