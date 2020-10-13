package com.company.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {

    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;


    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento){

        if(aumento <= 0){
            System.out.println("digite um valor positivo!");
        }else{
            this.salario += aumento;
        }

    }

    public void demitiFuncionario(){
        this.ativo = false;
        System.out.println("Funcionario desligado!");
    }

    public void setDataContratacao(String dataContratacao){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataContratacao = LocalDate.parse(dataContratacao, formatter);

    }

    public void imprimir(){
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("departamento = " + departamento);
        System.out.println("dataContratacao = " + dataContratacao);
        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);

    }

}
