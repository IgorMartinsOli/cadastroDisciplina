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
