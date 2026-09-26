import java.time.LocalDate;
import java.util.Date;

public class Pacientes {
    private Integer idPaciente;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String telefone;
    private String endereco;

    public Pacientes(Integer idPaciente, String nome, String cpf, LocalDate dataDeNascimento, String telefone, String endereco) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}