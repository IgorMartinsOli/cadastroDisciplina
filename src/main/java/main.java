
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
        ArrayList<CadastroDisciplina> cadastros;
        cadastros = new ArrayList();
        int qtContas = 0;
        int qtMaterias = 0;
        
        
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
                    int usuario;
                    String senha;
                    
                    System.out.println("Digite seu nome: ");
                    nome = scanner.next();
                    System.out.println("Digite a senha: ");
                    senha = scanner.next();
                    usuario = qtContas;
                    qtContas++;
                    System.out.println("Seu usuario é: "+usuario);
                    
                    Aluno aluno = new Aluno(nome, ano, usuario, senha);
                    users.add(aluno);
                    break;
                }
                
                case 2 -> {
                    int usuarioAtual;
                    String senhaAtual;
                    int auxLogin;
                   
                    do{
                    System.out.println("Digite o usuario: ");
                    usuarioAtual = scanner.nextInt();
                    
                    System.out.println("Digite a senha: ");
                    senhaAtual = scanner.next();
                    
                    Aluno auxiliar = users.get(usuarioAtual);
                    
                    if( !auxiliar.getSenha().equals(senhaAtual) || auxiliar.getUsuario() != usuarioAtual){
                        System.out.println("Usuario ou senha incorretos ou inexistentes!");
                        auxLogin = 1;
                    }else{
                        System.out.println("Selecione a disciplina que deseja matricular: ");
                        for(int i = 0; i < materias.size(); i++){
                            System.out.println(i+" - "+materias.get(i).getNome());
                        }
                        System.out.println("Digite a materia que deseja: ");
                        int materiaS = scanner.nextInt();
                        
                        CadastroDisciplina newCadastro = new CadastroDisciplina(usuarioAtual, materiaS);
                        cadastros.add(newCadastro);
                        
                        auxLogin = 0;
                    }
                    
                    }while(auxLogin == 1);
                    break;
                }
                
                case 3 -> {
                    System.out.println("Digite o nome da materia: ");
                    String nome = scanner.next();
                    System.out.println("Digite a carga horaria (ex: 00.00): ");
                    String ch = scanner.next();
                    
                    Disciplina disciplina = new Disciplina(qtMaterias, nome, ch);
                    materias.add(disciplina);
                    System.out.println("Disciplina cadastrada, id: "+qtMaterias+", retorne ao menu inicial!");
                    qtMaterias++;
                    
                }
            }
        }while(opcaoGeral != 0);
        
    }    
}
