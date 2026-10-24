import java.util.ArrayList;
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
                case 5:
                    sistema.cadastrarPaciente();
                    break;
                case 6:
                    sistema.cadastrarMedico();
                    break;
                case 7:
                    sistema.registrarConsulta();
                    break;
                case 8:
                    break;

            }
        } while (resposta != 8);


    }



}
