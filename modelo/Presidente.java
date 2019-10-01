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
public class Presidente extends Pessoa implements IAcessoContaBancaria{
    protected String indicacao;
    protected int anoNascimento;
    protected int senha;

    public Presidente() {
    }

    public Presidente(String indicacao, int anoNascimento) {
        this.indicacao = indicacao;
        this.anoNascimento = anoNascimento;
    }

    public Presidente(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.indicacao = indicacao;
        this.anoNascimento = anoNascimento;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public void presPais(){
        System.out.println("Sou presidente do Brasil!");
    }

    @Override
    public boolean verificar() {
        if(this.senha == 123456){
            return true;
        }else return false;
        
    }
    
    public void exibirDados(){
        System.out.println("PRESIDENTE\nNome: " + this.nome + "\nFone: "+this.fone+"\nEmail: "+this.email+"\nIdade: "+this.idade+"\nCPF: "+this.cpf+"Senha: "+this.senha);
    }

    @Override
    public void validarCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
