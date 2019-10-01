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
public class Engenheiro extends Pessoa{
  
    protected String projeto;
    protected String sexo;
    protected double peso;
    protected double altura;
    protected double calcIMC;
    //protected final String TIPO;

    public Engenheiro() {
    }

    public Engenheiro(String projeto, String sexo, double peso, double altura, double calcIMC) {
        this.projeto = projeto;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.calcIMC = calcIMC;
    }

    public Engenheiro(String projeto, String sexo, double peso, double altura, double calcIMC, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.projeto = projeto;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.calcIMC = calcIMC;
    }

    

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCalcIMC() {
        return calcIMC;
    }

    public void setCalcIMC(double calcIMC) {
        this.calcIMC = calcIMC;
    }
    
    
    
    public double calcularIMC(double a, double p){
        this.calcIMC = p / (a * 2);
        System.out.println(this.calcIMC);
        return this.calcIMC;
    }
    
    public void resultIMC(){
        if(this.sexo == "M"){
            if(this.calcIMC < 20.7){
                System.out.println("Abaixo do peso ideal");
            }else if((this.calcIMC > 20.7) && (this.calcIMC < 26.4)){
                System.out.println("Peso ideal");
            }else System.out.println("Acima do peso ideal");
        }
        if(this.sexo == "F"){
            if(this.calcIMC < 19){
                System.out.println("Abaixo do peso ideal");
            }else if((this.calcIMC > 19) && (this.calcIMC < 25.8)){
                System.out.println("Peso ideal");
            }else System.out.println("Acima do peso ideal");
        }
    }
    
    public void trabEngenheiro(){
        System.out.println("Trabalho na Empresa XYZ");
    }
    
    public void exibirDados(){
        System.out.println("ENGENHEIRO\nNome: " + this.nome + "\nFone: "+this.fone+"\nEmail: "+this.email+"\nIdade: "+this.idade+"\nCPF: "+this.cpf+"Altura: "+this.altura+"Peso: "+this.peso+"Senho: "+this.sexo);
    }

    @Override
    public void validarCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
