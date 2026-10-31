import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Sistema sistema;
    public Pacientes pacientes;
    public Medicos medicos;
    public Consulta consulta;

    ArrayList <Consulta> historico = new ArrayList<>(sistema.consultarHistorico(pacientes));
    ArrayList <Consulta>  consultasDoMedico = new ArrayList<>(sistema.consultarConsultasDoMedico(medicos));
    ArrayList <Consulta> dadosDaConsulta = new ArrayList<>(sistema.consultarDadosDaConsulta(consulta));

public void mostrarHistorico(){
    if (historico.isEmpty()){
        System.out.println("Não possui consultas");
    }else{
        for (Consulta consulta : historico){
            System.out.println(consulta);
        }
    }

}
public void mostrarConsultasDoMedico(){
    if (consultasDoMedico.isEmpty()){
        System.out.println("Não realizou consultas");
    }else {
        for (Consulta consulta : consultasDoMedico){
            System.out.println(consulta);
        }
    }

}
public void mostrarDadosDaConsulta(){
    for (Consulta consulta : dadosDaConsulta){
        System.out.println(consulta);
    }
}


    public static void main(String[] args) {
        List <Medicos> medico = new ArrayList<>();
        List <Pacientes> pacientes = new ArrayList<>();
        List <Consulta> consultas = new ArrayList<>();
        Sistema sistema = new Sistema();
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int resposta;

        do {


            System.out.println("O que você deseja fazer?");
            System.out.println("[1] - consultar histórico de paciente");
            System.out.println("[2] - consultar consultas de medico");
            System.out.println("[3] - consultar dados de uma consulta");
            System.out.println("[4] - cancelar consulta");
            System.out.println("[5] - cadastrar paciente");
            System.out.println("[6] - cadastrar médico");
            System.out.println("[7] - registrar consulta");
            System.out.println("[8] - fechar sistema");
            resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    main.mostrarHistorico();
                    break;
                case 2:
                    main.mostrarConsultasDoMedico();
                    break;
                case 3:
                    main.mostrarDadosDaConsulta();
                    break;
                case 4:
                    sistema.cancelarConsulta();
                    break;
                case 5: {
                    System.out.println("id: ");
                    Long idPaciente = Long.parseLong(scanner.nextLine());
                    System.out.println("nome:");
                    String nomePaciente = scanner.nextLine();
                    System.out.println("cpf: ");
                    String cpfPaciente = scanner.nextLine();
                    System.out.println("data de nascimento: ");
                    LocalDate dataDeNascimento = LocalDate.parse(scanner.nextLine());
                    System.out.println("telefone: ");
                    String telefonePaciente = scanner.nextLine();
                    System.out.println("endereço: ");
                    String enderecoPaciente = scanner.nextLine();

                    Pacientes paciente = new Pacientes(
                            idPaciente,
                            nomePaciente,
                            cpfPaciente,
                            dataDeNascimento,
                            telefonePaciente,
                            enderecoPaciente
                    );

                    sistema.cadastrarPaciente(paciente);

                    break;
                }
                case 6: {
                    System.out.println("id: ");
                    Long idMedico = Long.parseLong(scanner.nextLine());
                    System.out.println("nome: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.println("telefone: ");
                    String telefoneMedico = scanner.nextLine();
                    System.out.println("crm: ");
                    String crm = scanner.nextLine();
                    System.out.println("especialidade: ");
                    for (Especialidades e : Especialidades.values()) {
                        System.out.println(e);
                    }
                    Especialidades especialidades = Especialidades.valueOf(scanner.nextLine().toUpperCase());

                    Medicos medicos = new Medicos(idMedico,
                            nomeMedico,
                            telefoneMedico,
                            crm,
                            especialidades);

                    sistema.cadastrarMedico(medicos);
                    break;
                }
                case 7: {
                    System.out.println("id:");
                    Long idConsulta = Long.parseLong(scanner.nextLine());
                    System.out.println("data: ");
                    ZonedDateTime dataConsulta = ZonedDateTime.parse(scanner.nextLine());
                    Status status = Status.AGENDADA;
                    System.out.println("Em qual atendimento resultará a consulta?");
                    Atendimentos atendimentos = null;
                    System.out.println("médico: ");
                    Long idMedico = Long.parseLong(scanner.nextLine());
                    Medicos medicos = medico.stream()
                                    .filter(m -> m.getIdMedico().equals(idMedico))
                                            .findFirst()
                                                    .orElse(null);
                    System.out.println("paciente: ");
                    Long idPaciente = Long.parseLong(scanner.nextLine());
                    Pacientes paciente = pacientes.stream()
                            .filter(p -> p.getIdPaciente().equals(idPaciente))
                            .findFirst()
                            .orElse(null);

                    Consulta consulta = new Consulta(idConsulta,
                            dataConsulta,
                            medicos,
                            paciente,
                            atendimentos
                            );


                    sistema.registrarConsulta(consulta);
                    break;
                }
                case 8:
                    System.out.println("Encerrando");
                    break;

            }
        } while (resposta != 8);


            }



}
