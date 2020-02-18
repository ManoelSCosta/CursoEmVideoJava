package Aulas;
import java.util.Scanner;
public class TesteAula {
    public static void main (String [] args){
        //Variáveis
        String nome;
        
        //Entrada
        //Método scanner para pegar dados do terminal
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        nome = sc.nextLine();
        
        //Saida
        System.out.println("Seu nome é: "+nome);
        
    }   
}
