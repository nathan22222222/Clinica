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
}
