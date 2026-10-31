public class Medicos {
    private Long idMedico;
    private String nomeMedico;
    private String telefoneMedico;
    private String crm;
    private Especialidades especialidade;

    public Medicos(Long idMedico, String nomeMedico, String telefoneMedico, String crm, Especialidades especialidade) {
        this.idMedico = idMedico;
        this.nomeMedico = nomeMedico;
        this.telefoneMedico = telefoneMedico;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getTelefoneMedico() {
        return telefoneMedico;
    }

    public void setTelefoneMedico(String telefoneMedico) {
        this.telefoneMedico = telefoneMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidades especialidade) {
        this.especialidade = especialidade;
    }
}
