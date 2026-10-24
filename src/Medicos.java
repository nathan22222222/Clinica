public class Medicos {
    private Long idMedico;
    private String nome;
    private String telefone;
    private String crm;
    private Especialidades especialidade;

    public Medicos(Long idMedico, String nome, String telefone, String crm, Especialidades especialidade) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.telefone = telefone;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
