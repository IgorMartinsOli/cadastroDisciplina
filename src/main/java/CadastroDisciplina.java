/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor_
 */
public class CadastroDisciplina implements ICadastroDisciplina{
    private int aluno;
    private int disciplina;
    
    public CadastroDisciplina(int aluno, int disciplina){
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }
    
}
