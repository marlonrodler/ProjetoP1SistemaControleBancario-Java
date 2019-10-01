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
public class Diretor extends Pessoa implements IAcessoContaBancaria{
    protected int anoCargo;
    protected String situacao;
    protected int senha;

    public Diretor() {
    }

    public Diretor(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.anoCargo = anoCargo;
        this.situacao = situacao;
    }

    public int getAnoCargo() {
        return anoCargo;
    }

    public void setAnoCargo(int anoCargo) {
        this.anoCargo = anoCargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    @Override
    public boolean verificar() {
        if(this.senha == 123456){
            return true;
        }else return false;
        
    }
    
    public void escolaQueTrabalha(){
        System.out.println("Trabalho no Pujol");
    }
    
    public void exibirDados(){
        System.out.println("DIRETOR\nNome: " + this.nome + "\nFone: "+this.fone+"\nEmail: "+this.email+"\nIdade: "+this.idade+"\nCPF: "+this.cpf+"Senha: "+this.senha);
    }

    @Override
    public void validarCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
