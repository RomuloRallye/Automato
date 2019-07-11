  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatos;

import java.util.Scanner;

/**
 *
 * @author Rallye
 */
public class Automatos {

    int cont;
    char[] palavra;

    public static void main(String[] args) {
        Automatos automato = new Automatos();
        String sentenca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a sentença");
        sentenca = entrada.nextLine();
        automato.palavra = sentenca.toCharArray();
        automato.Iniciar();
    }

    public void Iniciar() {
        cont = 0;
        q0();
    }

    public void q0() {
        if (cont < palavra.length){
            if(palavra[cont] == 'I'){
                cont ++;
                q1();
            }
            else {
                qerro();
            }
        }
    }

    public void q1() {
        if(cont < palavra.length){
            if(palavra[cont] == 'F'){
                cont ++;
                q2();
            }
            else {
                qerro();
            }
        }
    }

    public void q2() {
        if(cont < palavra.length){
            if (palavra[cont] == ' '){
                cont ++;
                q3();
            }
            else {
                qerro();
            }
        }
    }
    public void q3() {
        if(cont < palavra.length){
            if(palavra[cont] == 'a'){
                cont ++;
                q4();
            }
            else if(palavra[cont]=='b') {
                cont ++;
                q4();
            }
            else {
                qerro();
            }
        }
    }
    
    public void q4() {
        if (cont < palavra.length){
            if(palavra[cont]==' '){
                cont++;
                q5();
            }
            else {
                qerro();
            }
        }
    }
    
    public void q5(){
        if(cont < palavra.length){
            if(palavra[cont] == '>'){
                cont++;
                q6();
            }
            else {
                qerro();
            }
        }
    }
    
    public void q6(){
        if(cont < palavra.length){
            if(palavra[cont] == ' '){
                cont++;
                q7();
            }
            else {
                qerro();
            }
        }
    }
    
    public void q7(){
        if(cont < palavra.length){
            if(palavra[cont] == '0'){
                cont++;
                qf();
            }
            else if (palavra[cont] == '1'){
                cont++;
                qf();
            }
            else {
                qerro();
            }
        }
    }

    public void qf() {
        System.out.println("Autômato ACEITA a palavra!");
    }

    public void qerro() {
        System.out.println("Autômato REJEITA a palavra!");
    }

    
}
