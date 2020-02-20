/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula04.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author 26003980
 */
public class IdiomaDoSistema {
    public static void main(String[] args) {
        //Forma 1
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
        
        /** Forma 2
         * System.getProperties();
        System.out.println("O idioma do sistema é: ");
        System.out.println(System.getProperty("user.language"));
        A forma dois é mais apreviada
         * a forma 1 mostra por extenso o idioma do sistema
         * neste caso, acho que a forma 1 é a mais indicada
         */
    }
    
}
