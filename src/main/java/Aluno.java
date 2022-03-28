/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor_
 */
public class Aluno extends Pessoa{
    private int periodo;
    private int ano;

    public Aluno(String nome, int ano, String usuario, String senha) {
        super(nome, usuario, senha);
        this.periodo = periodo = 1;
        this.ano = ano;
    }
    
    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void alterarPeriodoAno(int ano, int periodo) {
        setPeriodo(periodo);
    }
}
