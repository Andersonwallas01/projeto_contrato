package Program;

import ententies.enums.Nivel_Trabalhador;
import entities.ContratoHoras;
import entities.Departamento;
import entities.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("entre com o nome departamento: ");
        String departamentoName = sc.nextLine();

    System.out.println("digite os dados do trabalhador: ");
        System.out.println("nome: ");
    String nome_trabalhador = sc.nextLine();
        System.out.println("nivel: ");
    String nivel_trabalhador = sc.nextLine();
        System.out.println("base do salario: ");
        double base_salario = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome_trabalhador,Nivel_Trabalhador.valueOf(nivel_trabalhador),base_salario, new Departamento(departamentoName));

    System.out.println("quantos contratos para este trabalhador?");
    int n = sc.nextInt();

    for (int i = 0; i<n ; i++ ){
        System.out.println("entre com os " + (i+1) + "# dados do contrato:");
        System.out.print("data (DD/MM/YYYY): ");
        Date datacontrato = sdf.parse(sc.next());
        System.out.print("valor por hora: ");
        double valorPorHora = sc.nextDouble();
        System.out.print("duração (hora): ");
        int horas = sc.nextInt();
        ContratoHoras contrato = new ContratoHoras(datacontrato, valorPorHora, horas);
        trabalhador.addcontrato(contrato);

    }
        System.out.println();
        System.out.print("entre com o mês e ano para calcular a renda (MM/YYYY): ");
        String  mes_ano =  sc.next();
        int mes = Integer.parseInt(mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        System.out.println("nome:" + trabalhador.getNome());
        System.out.println("departamento:" + trabalhador.getDepartamento().getNome());
        System.out.println("renda de " + mes_ano + ": " +String.format("%.2f", trabalhador.renda(mes,ano)));




sc.close();

    }
}
