package clinica.controller;

//import clinica.model.Consulta;
//import clinica.model.Medico;
import clinica.model.Paciente;
import clinica.model.Secretaria;
import java.util.ArrayList;

public class ControlSecretario {
    ArrayList<Paciente> pacientes = new ArrayList<>();
    //ArrayList<Consulta> consultas = new ArrayList<>();
    //ArrayList<Medico> medicos = new ArrayList<>();
            
    public boolean CadastroPaciente(String nome, String dataNascimento, String endereco, 
                String email, String telefone, String tipoConvenio, String cpf){
        
        if (nome != null && nome.length()>0 && dataNascimento != null && dataNascimento.length() > 0
                    && endereco!= null && email != null && telefone.length()>0 
                    && telefone != null && tipoConvenio != null && 
                    tipoConvenio.length() > 0 && cpf != null && cpf.length()>0){
            
            Secretaria secre = new Secretaria("Solange", "20-05-1990", "Parque das Grevilhas"
                                              ,"solange@gmail.com", "9736-4125");
            
            Paciente paciente = new Paciente(tipoConvenio, nome, dataNascimento, endereco,
                                         email, telefone, cpf);
        
            pacientes.add(paciente);
            
            
            return true;
        }
        return false;
    }
    
    public boolean EditarPaciente(String cpf, String campo, String edicao){
        boolean flag = false;
        System.out.println("ENtrou");
        int index = -1;
        if (cpf != null && cpf.length() >0){
            System.out.println(pacientes.get(0).getCpf());
            for (Paciente paciente: pacientes){
                System.out.println(cpf + " e " + paciente.getCpf());
                if (paciente.getCpf().equals(cpf)){
                  index = pacientes.indexOf(paciente);
                  System.out.println(index);
                  flag = true;
                }
            }
            if (!flag){
                return false;
            }
            String tipoEdicao = edicao.toLowerCase();
        
            if (tipoEdicao.equals("nome")) {
                pacientes.get(index).setNome(campo);
                
            } else if (tipoEdicao.equals("data de nascimento")) {
                pacientes.get(index).setDataNascimento(campo);
                
            } else if (tipoEdicao.equals("email")) {
                pacientes.get(index).setEmail(campo);

            } else if (tipoEdicao.equals("endereço")) {
                pacientes.get(index).setEndereco(campo);

            } else if (tipoEdicao.equals("telefone")) {
                pacientes.get(index).setTelefone(campo);

            } else if (tipoEdicao.equals("tipo de convenio")) {
                pacientes.get(index).setTipoConvenio(campo);
                
            }else{
                return false;
            }
            return true;
        }
        
        return false;
    }
    
    public boolean RelatorioCadastro(ArrayList<Paciente> paciente){
        return false;
        /*gerenciador.imprimirCadastros(pacientes);
        
            public void imprimirCadastros(ArrayList<Paciente> pacientes){
        System.out.println("---------------Imprimindo cadastros----------------");
        for(Paciente paciente : pacientes){
            System.out.println("\tPaciente " + pacientes.indexOf(paciente) +": "+ paciente.getNome());
            System.out.println("\tData de nascimento:" + paciente.getDataNascimento());
            System.out.println("\tEndereçp:" + paciente.getEndereco());
            System.out.println("\tE-mail:" + paciente.getEmail());
            System.out.println("\tTelefone:" + paciente.getTelefone());
            System.out.println("\tCPF:" + paciente.getCpf());
            System.out.println("\tTipo de convenio:" + paciente.getTipoConvenio());
            System.out.println("\t---\t--\t--\n");
        */

    }
            
    
}
