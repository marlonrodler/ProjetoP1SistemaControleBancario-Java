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
public class Gerente extends Pessoa{
    protected String setor;
    protected double salario;
    protected int qtdadePessoasGerencia;

    public Gerente() {
    }

    public Gerente(String setor, double salario, int qtdadePessoasGerencia, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.setor = setor;
        this.salario = salario;
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
    }
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdadePessoasGerencia() {
        return qtdadePessoasGerencia;
    }

    public void setQtdadePessoasGerencia(int qtdadePessoasGerencia) {
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
    }
    
    public double fSalario(double salario){
        if((this.qtdadePessoasGerencia > 10) && (this.setor == "Compras") || (this.qtdadePessoasGerencia > 10) ){
            salario = (this.salario * 0.10) + this.salario;
            return salario;
        }else if(this.setor == "Compras"){
            salario = (this.salario * 0.05) + this.salario;
            return salario;
        }else return this.salario;
    }
    
    public void ondeTrabalho(){
        System.out.println("Trabalho na FIAT");
    }
}
