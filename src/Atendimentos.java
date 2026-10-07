import java.time.LocalDateTime;

public class Atendimentos {
private Long idAtendimento;
private Consulta consulta;
private String queixaPrincipal;
private String diagnostico;
private String prescricao;

private LocalDateTime inicioDoAtendimento;
private LocalDateTime fimDoAtendimento;

    public Atendimentos(Long idAtendimento, Consulta consulta, String queixaPrincipal, String diagnostico, String prescricao, LocalDateTime inicioDoAtendimento, LocalDateTime fimDoAtendimento) {
        if (consulta == null){
            throw new IllegalArgumentException ("Nenhuma consulta encontrada");
        }

        this.idAtendimento = idAtendimento;
        this.consulta = consulta;
        this.queixaPrincipal = queixaPrincipal;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.inicioDoAtendimento = inicioDoAtendimento;
        this.fimDoAtendimento = fimDoAtendimento;
    }

    public Long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public LocalDateTime getInicioDoAtendimento() {
        return inicioDoAtendimento;
    }

    public void setInicioDoAtendimento(LocalDateTime inicioDoAtendimento) {
        this.inicioDoAtendimento = inicioDoAtendimento;
    }

    public LocalDateTime getFimDoAtendimento() {
        return fimDoAtendimento;
    }

    public void setFimDoAtendimento(LocalDateTime fimDoAtendimento) {
        this.fimDoAtendimento = fimDoAtendimento;
    }
}

