import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Sistema sistema;
    Pacientes pacientes;
    Medicos medicos;
    Consulta consulta;

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
    Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja fazer?");
        System.out.println("[1] - consultar histórico de paciente");
        System.out.println("[2] - consultar consultas de medico");
        System.out.println("[3] - consultar dados de uma consulta");
        System.out.println("[4] - cancelar consulta");
        System.out.println("[5] - cadastrar paciente");
        System.out.println("[6] - cadastrar médico");
        System.out.println("[7] - registrar consulta");
        System.out.println("[8] - fechar sistema");
        int resposta = scanner.nextInt();

        switch (resposta){
            case 1:



        }















    }



}
