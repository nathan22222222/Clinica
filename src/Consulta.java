import jdk.jshell.Snippet;

import java.io.ObjectInputFilter;
import java.time.ZonedDateTime;
import java.util.Date;

public class Consulta {
    private Integer idConsulta;
    private ZonedDateTime dataConsulta;
    private Status status;

    private Medicos medico;
    private Pacientes paciente;

    public Consulta(Integer idConsulta, ZonedDateTime dataConsulta, Status status, Medicos medico, Pacientes paciente) {
        this.idConsulta = idConsulta;
        this.dataConsulta = dataConsulta;
        this.status = status;
        this.medico = medico;
        this.paciente = paciente;
    }
}
