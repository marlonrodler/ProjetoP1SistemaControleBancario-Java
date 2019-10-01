/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Foi criada a Classe Pai definindo atributos e metodos (Pessoa); 
            Conceito classe: criado classes: Pessoa, Diretor, Engenheiro, Presidente, Secretario;
            Conceito Encapsulamento: Utilizado em cada uma o encapsulamento, na classe pai e nas subclasses;
            Conceito Herança: Contendo Henrança entre Pessoa (classe pai) com as subclasses(Diretor, Engenheiro, Presidente, Secretario);
            Conceito de Interface: Criado interface para gerar um metodo para Diretor e presidente;
            Conceito de Override: tendo a sobre escrita do metodo na interface;
            Conceito de Polimorfismo: identificada em cada classe tendo suas proprias caracteristicas;
        */
        
        Gerente objGerente01 = new Gerente();
        objGerente01.setNome("Marlon");
        objGerente01.setCpf("11122233311");
        objGerente01.setEmail("gerente@gerente.com");
        objGerente01.setFone("111111111");
        objGerente01.setIdade(25);
        objGerente01.setQtdadePessoasGerencia(9);
        objGerente01.setSalario(5000);
        objGerente01.setSetor("Compras");
        System.out.println("GERENTE");
        System.out.println("Nome: "+objGerente01.nome);
        System.out.println("Salario: "+ objGerente01.fSalario(objGerente01.getSalario()));
        objGerente01.ondeTrabalho();
        System.out.println("\n\n");
        
        /************************************************************************************/
        System.out.println("-----------------------------------------------------------------");
        Engenheiro objEngenheiro01 = new Engenheiro();
        objEngenheiro01.setNome("Thiago");
        objEngenheiro01.setCpf("11133344411");
        objEngenheiro01.setEmail("engenheiro@engenheiro.com");
        objEngenheiro01.setFone("222222222");
        objEngenheiro01.setIdade(26);
        objEngenheiro01.setSexo("F");
        objEngenheiro01.setPeso(69);
        objEngenheiro01.setAltura(1.70);
        /*System.out.println("ENGENHEIRO");
        System.out.println("Engenheiro(a): ");
        System.out.println("Nome: "+ objEngenheiro01.getNome()+"\nSexo: "+ objEngenheiro01.getSexo()+"\nPeso: "+objEngenheiro01.getPeso()+"\nAlura: "+objEngenheiro01.getAltura());*/
        objEngenheiro01.exibirDados();
        System.out.println("Valor do IMC: "+ objEngenheiro01.calcularIMC(objEngenheiro01.getAltura(),objEngenheiro01.getPeso()));
        System.out.println("Resultado do IMC: ");
        objEngenheiro01.resultIMC();
        System.out.println("\n\n");
        
        
        /************************************************************************************/
        
        Presidente objPresidente01 = new Presidente();
        
        objPresidente01.setNome("Matheus");
        objPresidente01.setCpf("11144455511");
        objPresidente01.setEmail("presidente@presidente.com");
        objPresidente01.setFone("333333333");
        objPresidente01.setIdade(27);
        objPresidente01.setSenha(123456);
        objPresidente01.exibirDados();
        System.out.println("Acesso: ");
        System.out.println(objPresidente01.verificar()?"        Permitido" : "        Negado");
        
        
        /************************************************************************************/
        System.out.println("\n\n");
        Diretor objDiretor01 = new Diretor();
        objDiretor01.setNome("Bruna");
        objDiretor01.setCpf("11155566611");
        objDiretor01.setEmail("diretora@diretora.com");
        objDiretor01.setFone("444444444");
        objDiretor01.setIdade(28);
        objDiretor01.setSenha(12346);
        objDiretor01.exibirDados();
        System.out.println(objDiretor01.verificar()?"Acesso Permitido" : "Acesso Negado");
        
        System.out.println("\n\n");
        
        
        /************************************************************************************/
        
        Secretario objSecretario01 = new Secretario();
        objSecretario01.setNome("Joao");
        objSecretario01.setCpf("11155577711");
        objSecretario01.setEmail("secretario@secretario.com");
        objSecretario01.setFone("555555555");
        objSecretario01.setIdade(28);
        objSecretario01.exibirDados();
        System.out.println("\n\n");
        /************************************************************************************/
        
        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        listaPessoa.add(objGerente01);
        listaPessoa.add(objEngenheiro01);
        listaPessoa.add(objPresidente01);
        listaPessoa.add(objDiretor01);
        listaPessoa.add(objSecretario01);
        /*System.out.println("Nomes: ");
        for(int j = 0; j <listaPessoa.size(); j++){
            System.out.println(listaPessoa.get(j).getNome());
        }*/
        System.out.println("Pessoas cadastradas:");
        Pessoa objPessoa = new Pessoa();
        for(int k = 0; k <listaPessoa.size(); k++){
            
            objPessoa = listaPessoa.get(k);
            if(objPessoa.getNome() == "Thiago"){
                System.out.println("ENCONTREI O/A: "+ objPessoa.getNome());
            }
            System.out.println(objPessoa.getNome());
            
        }
        
    }
    
}
