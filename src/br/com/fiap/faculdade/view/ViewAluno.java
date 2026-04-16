package br.com.fiap.faculdade.view;

import br.com.fiap.faculdade.model.AlunoFaculdade;
import br.com.fiap.faculdade.model.Cidade;
import br.com.fiap.faculdade.model.Endereco;

import java.util.Scanner;

public class ViewAluno {

        static void main() {

            Scanner sc = new Scanner(System.in);
            AlunoFaculdade aluno = new AlunoFaculdade();
            int op;

            do{
                IO.println("Selecione a opção desejada: \n" +
                        "1- Cadastrar Aluno:  \n"  +
                        "2- Exibir Aluno: \n" +
                        "3- Sair: \n");
                op = sc.nextInt();

                switch(op){
                    case 1:
                        IO.println("Digite o RM do Aluno: ");
                        int registroMatricula = sc.nextInt();

                        IO.println("Digite o nome do Aluno: ");
                        String nome = sc.next() + sc.nextLine();

                        System.out.println("Digite o estado: ");
                        String estado = sc.nextLine();

                        System.out.println("Digite a cidade: ");
                        String nomeCidade = sc.nextLine();


                        Cidade cidade = new Cidade(nomeCidade, estado);

                        System.out.println("Digite o logradouro: ");
                        String logradouro = sc.nextLine();

                        System.out.println("Digite o número: ");
                        int numero = sc.nextInt();

                        System.out.println("Digite o CEP: ");
                        int cep = sc.nextInt();


                        Endereco endereco = new Endereco(logradouro, numero, cep, cidade);

                        aluno.setNome(nome);
                        aluno.setRegistroMatricula(registroMatricula);
                        aluno.setEndereco(endereco);
                        break;

                    case 2:
                        IO.println("Nome: " + aluno.getNome() + " \n RM: " + aluno.getRegistroMatricula() + " \n Endereço Completo: " + aluno.getEndereco());
                        break;

                    case 3:
                        IO.println("Programa finalizado");
                        break;

                    default:
                        IO.println("Opção Inválida");
                }

            }while (op != 3);

            sc.close();
        }
    }
