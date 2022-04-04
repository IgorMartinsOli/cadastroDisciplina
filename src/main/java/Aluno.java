
public class Aluno extends Pessoa implements IMetodosAluno{
    private int periodo;
    private int ano;

    public Aluno(String nome, int ano, int usuario, String senha) {
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
    
    @Override
    public void boasVindas() {
        System.out.println("Olá "+this.getNome());
    }
    
    @Override
    public boolean autentica(String senha){
        return senha == null ? this.getSenha() == null : senha.equals(this.getSenha());
    }
}
