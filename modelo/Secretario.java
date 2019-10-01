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
public class Secretario extends Pessoa{
    private String assinaturaDigital;
    private String regional;

    public Secretario() {
    }

    public Secretario(String assinaturaDigital, String regional) {
        this.assinaturaDigital = assinaturaDigital;
        this.regional = regional;
    }

    public Secretario(String assinaturaDigital, String regional, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.assinaturaDigital = assinaturaDigital;
        this.regional = regional;
    }
    
    public void exibirDados(){
        System.out.println("SECRETARIO\nNome: " + this.nome + "\nFone: "+this.fone+"\nEmail: "+this.email+"\nIdade: "+this.idade+"\nCPF: "+this.cpf+"Altura: ");
    }

    @Override
    public void validarCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
