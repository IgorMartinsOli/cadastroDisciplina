/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor_
 */
public abstract class Pessoa implements InterfaceGetsSets{
    private String nome;
    private int usuario;
    private String senha;
    
    public Pessoa(String nome, int usuario, String senha ){
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
