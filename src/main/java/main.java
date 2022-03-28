
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author igor_
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //login login = new login();
        ArrayList<Aluno> users = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disciplina> materias = new ArrayList();
        ArrayList<CadastroDisciplina> cadastros = new ArrayList();
        
        
        int opcaoGeral;
        
        do{
            System.out.println("Bem-vindo, selecione o que deseja: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Entrar");
            System.out.println("3 - Cadastrar materia");
            opcaoGeral = scanner.nextInt();
            
            switch(opcaoGeral){
                case 1 -> {
                    String nome;
                    int ano = 2022;
                    String usuario;
                    String senha;
                    
                    System.out.println("Digite seu nome: ");
                    nome = scanner.next();
                    System.out.println("Digite seu usuario: ");
                    usuario = scanner.next();
                    System.out.println("Digite a senha: ");
                    senha = scanner.next();
                    
                    Aluno aluno = new Aluno(nome, ano, usuario, senha);
                    users.add(aluno);
                    break;
                }
                
                case 2 -> {
                    String usuario;
                    String senha;
                    
                    System.out.println("Digite seu usuario: ");
                    usuario = scanner.next();
                    System.out.println("Digite sua senha: ");
                    senha = scanner.next();
                    
                    for(int i = 0; i < users.size(); i++){
                        if(usuario.equals(users.get(i).nome) && senha.equals(users.get(i).senha)){
                            System.out.println("Selecione a materia que deseja matricular");
                            for(int j = 0; j < materias.size(); j++){
                                System.out.println(""+j+" - "+materias.get(j).nome);
                            }
                            int auxCadastroDisciplica = scanner.nextInt();
                            CadastroDisciplina cadastro = new CadastroDisciplina(i, auxCadastroDisciplica);
                            cadastros.add(cadastro);
                        }
                    }
                    break;
                }
                
                case 3 -> {
                    System.out.println("Digite o nome da materia: ");
                    String nome = scanner.next();
                    System.out.println("Digite a carga horaria (ex: 00.00): ");
                    String ch = scanner.next();
                    
                    Disciplina disciplina = new Disciplina(nome, ch);
                    materias.add(disciplina);
                    System.out.println("Disciplina cadastrada, retorne ao menu inicial!");
                }
            }
        }while(opcaoGeral != 0);
        
    }    
}
