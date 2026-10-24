import jdk.jshell.Snippet;

import java.io.ObjectInputFilter;
import java.time.ZonedDateTime;
import java.util.Date;

public class Consulta {
    private Long idConsulta;
    private ZonedDateTime dataConsulta;
    private Status status;
    private Atendimentos atendimento;

    private Medicos medico;
    private Pacientes paciente;

    public Consulta(Long idConsulta, ZonedDateTime dataConsulta, Medicos medico, Pacientes paciente, Atendimentos atendimento) {
        if (medico == null){
            throw new IllegalArgumentException("A consulta precisa de um médico!");
        }
        if (paciente == null){
            throw new IllegalArgumentException("A consulta precisa de um paciente!");
        }


        this.idConsulta = idConsulta;
        this.dataConsulta = dataConsulta;
        this.status = Status.AGENDADA;
        this.medico = medico;
        this.paciente = paciente;
        this.atendimento = atendimento;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public ZonedDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(ZonedDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Atendimentos getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimentos atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta=" + idConsulta +
                ", dataConsulta=" + dataConsulta +
                ", status=" + status +
                ", atendimento=" + atendimento +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
