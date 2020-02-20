/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula04.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author 26003980
 */
public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da tela é: ");
        System.out.println(d.width+"X"+d.height);
    }
}
