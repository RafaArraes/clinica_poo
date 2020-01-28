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
            
            secre.cadastrarPaciente(tipoConvenio, nome, dataNascimento, endereco,
                                         email, telefone, cpf);
            
            return true;
        }
        return false;
    }
    
    
}
