package clinica.controller;


//----------------------------------------------------------------
//Auxliar para fazer o controlador
//Seria a tela pro 1 trab
//Passar td as ordem o controlador e executar com a tela e os model
//----------------------------------------------------------------


import clinica.model.Consulta;
import clinica.model.GerenciadorDeMsg;
import clinica.model.GerenciarClinica;
import clinica.model.Medico;
import clinica.model.Paciente;
import clinica.model.Secretaria;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaClinica {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        Scanner leitura1 = new Scanner(System.in);
        
        Secretaria secretaria = new Secretaria("Solange", "20-05-1990", "Parque das Grevilhas"
                                              ,"solange@gmail.com", "9736-4125");
        
        Medico medico1 = new Medico(10.300, "Oftamologia","Luiz Augusto","28-03-1985","Centro","MedicoHumilde@gmail.com","99706666");
       
        GerenciarClinica gerenciador;
        gerenciador = new GerenciarClinica();
        GerenciadorDeMsg gerenciadorMSG = new GerenciadorDeMsg();
        
        boolean flag;
        int op,index=-1,conect=0;
        String cpf, data, horario, tipoEdicao;
            
        while (conect != 3){
            System.out.println("-------MENU INICIAL-------\n"
                + "[0] Secretaria\n"
                + "[1] Avisar consultas proximas\n"
                + "[2] Medico\n"
                + "[3] SAIR\n"
                + "--------------------------");
            System.out.print("Digite sua opção:");
            conect = leitura.nextInt();
            if (conect == 0) {
                do {
                    System.out.println("\n----------------Menu----------------\n"
                        + "[0] VOLTAR\n"
                        + "[1] Cadastrar um paciente\n"
                        + "[2] Editar os dados do paciente\n"
                        + "[3] Excluir um paciente\n"
                        + "[4] Imprimir cadastro\n"
                        + "[5] Cadastrar uma consulta\n"
                        + "[6] Editar os dados da consulta\n"
                        + "[7] Excluir uma consulta\n"
                        + "[8] Imprimir a(s) consultas\n"
                        + "[9] Consultas de amanha\n"
                        + "-------------------------------------");
                    System.out.print("\nDigite a sua opção:");
                    op = leitura.nextInt();
                    System.out.println();
                    switch (op) {
                        case 1:
                            //secretaria.cadastrarPaciente(pacientes);
                            break;

                        case 2:
                            flag = false;

                            System.out.print("Digite o cpf do paciente para fazer a edição:");
                            cpf = leitura1.nextLine();

                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag) {
                                System.out.print("Digite qual dados vai ser alterado do paciente:");
                                tipoEdicao = leitura1.nextLine();
                                secretaria.editarPaciente(pacientes, pacientes.get(index), tipoEdicao);
                            } else {
                                System.out.println("O paciente não está cadastrado");
                            }
                            break;

                        case 3:
                            System.out.println("Digite o cpf do paciente para excluir");
                            cpf = leitura1.nextLine();
                            int indice = 0;
                            boolean flag1 = false;

                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    indice = pacientes.indexOf(paciente);
                                    flag1 = true;
                                }
                            }
                            if (flag1) {
                                secretaria.excluirPaciente(pacientes, pacientes.get(indice));
                            } else {
                                System.out.println("O paciente não está cadastrado");
                            }

                            break;
                        case 4:
                            gerenciador.imprimirCadastros(pacientes);
                            break;
                        case 5:
                            System.out.print("Digite o cpf do paciente que vai fazer a consulta:");
                            cpf = leitura1.nextLine();
                            flag = false;

                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag) {
                                secretaria.cadastrarConsulta(consultas, pacientes.get(index), medico1);
                            } else {
                                System.out.println("O paciente não está cadastrado");
                            }
                            break;

                        case 6:
                            System.out.print("Digite o tipo de edição que vai fazer:");
                            tipoEdicao = leitura1.nextLine();
                            System.out.print("Digite a data da consulta que vai fazer a edição:");
                            data = leitura1.nextLine();
                            System.out.print("Digite o horário da consulta que vai fazer a edição:");
                            horario = leitura1.nextLine();
                            flag = false;

                            for (Consulta consulta : consultas) {
                                if (consulta.getData().equals(data) && consulta.getHorario().equals(horario)) {
                                    index = consultas.indexOf(consulta);
                                    flag = true;
                                }
                            }   

                            if (flag) {
                                secretaria.editarConsulta(consultas, consultas.get(index),
                                        tipoEdicao, pacientes);
                            } else {
                                System.out.println("A consulta não está cadastrada");
                            }
                            break;

                        case 7:
                            System.out.print("Entre com a data da consulta que deseja excluir:");
                            data = leitura1.nextLine();
                            System.out.print("Digite o horário da consulta qur deseja excluir:");
                            horario = leitura1.nextLine();
                            flag = false;

                            for (Consulta consulta : consultas) {
                                if (consulta.getData().equals(data) && consulta.getHorario().equals(horario)) {
                                    index = consultas.indexOf(consulta);
                                    flag = true;
                                }
                            }
                            if (flag) {
                                secretaria.excluirConsulta(consultas, consultas.get(index));
                            } else {
                                System.out.println("A consulta não está cadastrada!!");
                            }
                            break;

                        case 8:
                            gerenciador.imprimirConsultas(consultas);
                            break;
                        case 9:
                            secretaria.gerarRelatorio(consultas);
                            break;

                    }
                } while (op != 0);
            }

            else if (conect == 1) gerenciadorMSG.enviarMSG(consultas);

            else if (conect == 2){
                do {
                    System.out.println("\n----------------Menu----------------\n"
                    +"[0] VOLTAR\n"
                    +"[1] Consultando o paciente\n"
                    +"[2] Cadastro do prontuario do paciente\n"
                    +"[3] Editar dados do paciente\n"
                    +"[4] Editar prontuario do paciente\n"
                    +"[5] Excluir dados do paciente\n"        
                    +"[6] Excluir prontuario do paciente\n"        
                    +"[7] Imprimir dados de consultas\n"
                    +"[8] Relatorio Medico\n"
                    +"-------------------------------------");
                    System.out.print("\nDigite a sua opção:");
                    op = leitura.nextInt();
                    System.out.println();
                    switch (op) {
                        case 1:
                            medico1.cadastrarDados(pacientes);
                            break;

                        case 2:
                            medico1.cadastrarProntuario(pacientes);
                            break;

                        case 3:
                            index = 0;
                            flag = false;

                            System.out.print("Digite o cpf do paciente para fazer a edição:");
                            cpf = leitura1.nextLine();
                            
                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag) {
                                System.out.print("Digite qual dados vai ser alterado do paciente:");
                                tipoEdicao = leitura1.nextLine();
                                medico1.editarDados(pacientes, pacientes.get(index), tipoEdicao);
                            } else {
                                System.out.println("O paciente não está cadastrado");
                            }
                            break;
                        case 4:
                            index = 0;
                            flag = false;

                            System.out.print("Digite o cpf do paciente para fazer a edição:");
                            cpf = leitura1.nextLine();
                            
                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag) {
                                System.out.print("Digite qual dado vai ser alterado do paciente:");
                                tipoEdicao = leitura1.nextLine();
                                medico1.editarProntuario(pacientes, pacientes.get(index), tipoEdicao);
                            } else {
                                System.out.println("O paciente não está cadastrado");
                            }
                            break;
                        case 5:   
                            flag = false;
                            System.out.print("Digite o cpf do paciente para a exclusao:");
                            cpf = leitura1.nextLine();
                            
                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag){
                               medico1.excluirDados(pacientes, index);
                            }
                            else System.out.println("Paciente nao encontrado!");
                            break;
                        case 6:
                            flag = false;
                            System.out.print("Digite o cpf do paciente para a exclusao:");
                            cpf = leitura1.nextLine();
                            
                            for (Paciente paciente : pacientes) {
                                if (paciente.getCpf().equals(cpf)) {
                                    index = pacientes.indexOf(paciente);
                                    flag = true;
                                }
                            }
                            if (flag){
                                medico1.excluirProntuario(pacientes, index);
                            }
                            else System.out.println("Paciente nao encontrado!");                            
                            break;
                        case 7:
                            gerenciador.imprimirDadosMed(pacientes);
                            break;
                        case 8:
                            medico1.gerarRelatorioMed(pacientes, consultas);
                            break;
                    }
                } while (op != 0);
            }
        }
        System.out.println("---------------------------"
                + "\n..fechando..");
    }
}