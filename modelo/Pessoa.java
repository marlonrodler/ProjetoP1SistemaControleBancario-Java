/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Pessoa {
    protected String nome;
    protected String fone;
    protected String email;
    protected double idade;
    protected String cpf;

    public Pessoa() {
    }

    
    
    
    public Pessoa(String nome, String fone, String email, double idade, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    public void validarCPF(String cpf){}
    
    public void exibirDados(){}
}   
