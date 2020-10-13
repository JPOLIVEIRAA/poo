package com.company.Funcionario;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class FuncionarioTeste {


    public static void main(String[] args) {

        Funcionario func = new Funcionario();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Preencha os dados do funcionário");
        System.out.println("ID do funcionário");
        func.setIdFunc(parseInt(leitor.nextLine()));
        System.out.println("Nome do funcionário");
        func.setNomeFunc(leitor.nextLine());
        System.out.println("Departamento");
        func.setDepartamento(leitor.nextLine());
        System.out.println("Data da contratação use /:");
        func.setDataContratacao(leitor.nextLine());
        System.out.println("Salário");
        func.setSalario(Double.parseDouble(leitor.nextLine()));
        System.out.println("Documento");
        func.setDocumento(leitor.nextLine());
        System.out.println("Insira o valor de aumento");
        func.atualizarSalario(Double.parseDouble(leitor.nextLine()));

        func.imprimir();
        func.demitiFuncionario();
        func.imprimir();



    }
}
