/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classprincipal;

import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class Aluno {
    // Atributos: características do aluno da academia
    String nome; // usado para caracteres
    String cpf;  // usado para caracteres
    int idade;   // usado para números inteiros
    double peso; // usado para números decimais
    String objetivo;
    
    // Construtor vazio: método de inicialização
    public Aluno() {} 

    public void seApresentar() { 
        JOptionPane.showMessageDialog(null, "Aluno: " + nome + " cadastrado com sucesso!"); 
    }
    public boolean RealizarLogin(String login, String senha) { //método que tem o objetivo de verificar se uma tentativa de login foi bem-sucedida ou não
    
    if(login.equalsIgnoreCase("void") && senha.equalsIgnoreCase("5555") ){ //equalsIgnoreCase verifica se a String é igual, ignorando letras maiusculas/minusculas diferentes
     return true; //caso seja verdadeiro o login e senha retorna verdadeiro
    }
    else{
    return false; //caso o login e senha não seja verdadeiro retorna falso
    }      
               }
    public String obterResumo() {
        return "NOME: " + nome + " | CPF: " + cpf + " | IDADE: " + idade + " | PESO: " + peso + "kg | OBJETIVO: " + objetivo;
    }
    
    public boolean dadosEstaoValidos() {
        return !nome.isEmpty() && !cpf.isEmpty() && idade > 0;
    }
   
    public void ajustarPeso(double novoPeso) {
        this.peso = novoPeso;

               }
}


    

