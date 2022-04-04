/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor_
 */
public abstract class Pessoa{

    private String nome;
    private int usuario;
    private String senha;
    
    public Pessoa(String nome, int usuario, String senha ){
       this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getUsuario() {
        return usuario;
    }
    
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}