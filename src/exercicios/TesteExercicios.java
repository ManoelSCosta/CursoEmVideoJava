package exercicios;

import java.util.Scanner;

public class TesteExercicios {
    public static void main (String [] args){
        //Variáveis
        int a, b, s;
        
        //Entrada
        //Método scanner para pegar dados do terminal
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        a = sc.nextInt();
        
        System.out.print("Insira outro numero: ");
        b = sc.nextInt();
        
        //processamento de dados
        s = a+b;
        
        //Saida
        System.out.println("a soma de "+a+" + "+b+" é igual a: "+s);
        
    }
}
