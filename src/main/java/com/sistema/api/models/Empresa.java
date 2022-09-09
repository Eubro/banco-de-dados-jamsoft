
package com.sistema.api.models;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable  {
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @Column(name = "nome",nullable = false , length=200)
    private String nome;
   

    public Empresa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Empresa() {
    }
    

  
    
    public Empresa(String nome){
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
    
    
    
    
}
