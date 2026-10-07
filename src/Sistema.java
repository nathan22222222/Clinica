import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List <Pacientes> pacientes = new ArrayList<>();
    private List <Medicos> medicos = new ArrayList<>();
    private List <Consulta> consultas = new ArrayList<>();
    private List <Atendimentos> atendimentos = new ArrayList<>();

    public void cadastrarPaciente(Pacientes paciente){
        pacientes.add(paciente);
    }
    public void cadastrarMedico(Medicos medico){
        medicos.add(medico);
    }
    public void registrarConsulta(Consulta consulta){
        if (!pacientes.contains(consulta.getPaciente())){
            throw new  IllegalArgumentException ("Paciente não cadastrado");
        }
        if (!medicos.contains(consulta.getMedico())) {
            throw new IllegalArgumentException("Médico não cadastrado");
        }
        consultas.add(consulta);
    }
    public void registrarAtendimento (Atendimentos atendimento){
        atendimentos.add(atendimento);
    }
    public List<Consulta> consultarHistorico(Pacientes paciente) {
        return consultas.stream()
                .filter(c -> c.getPaciente().equals(paciente))
                .toList();
    }

    public List<Consulta> consultarConsultasDoMedico(Medicos medico) {
        return consultas.stream()
                .filter(c -> c.getMedico().equals(medico))
                .toList();
    }

    public void cancelarConsulta(Consulta consulta) {
        consulta.setStatus(Status.CANCELADA);
    }
}






