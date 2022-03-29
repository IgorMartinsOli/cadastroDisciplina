
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
        ArrayList<Aluno> users = new ArrayList<Aluno>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disciplina> materias = new ArrayList();
        ArrayList<CadastroDisciplina> cadastros = new ArrayList();
        int qtContas = 1;
        int qtMaterias = 1;
        
        
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
                    
                    Aluno auxiliar = users.get(--usuarioAtual);
                    System.out.println(auxiliar);
                    System.out.println(auxiliar.getNome());
                    System.out.println(auxiliar.getPeriodo());
                    
                        if(auxiliar.getSenha() == null ? senhaAtual != null : !auxiliar.getSenha().equals(senhaAtual)){
                            auxLogin = 1;
                        }else{
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
