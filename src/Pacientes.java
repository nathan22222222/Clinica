import java.time.LocalDate;

public class Pacientes {
    private Long idPaciente;
    private String nomePaciente;
    private String cpfPaciente;
    private LocalDate dataDeNascimento;
    private String telefonePaciente;
    private String enderecoPaciente;

    public Pacientes(Long idPaciente, String nomePaciente, String cpfPaciente, LocalDate dataDeNascimento, String telefone, String enderecoPaciente) {
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.dataDeNascimento = dataDeNascimento;
        this.telefonePaciente = telefone;
        this.enderecoPaciente = enderecoPaciente;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nomePaciente;
    }

    public void setNome(String nome) {
        this.nomePaciente = nome;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }
}