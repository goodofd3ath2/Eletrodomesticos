/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_eletrodomesticos;

import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class Prova_Eletrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        JOptionPane.showMessageDialog(null, ar.TemPainel());
        JOptionPane.showMessageDialog(null, ar.Disponivel());

        Produto produto = new Produto();
        JOptionPane.showMessageDialog(null, produto.Disponivel());
        
        Televisao tv = new Televisao();
        tv.marca("TOSHIBA");
        JOptionPane.showMessageDialog(null, tv.Descricao());
        
        int opcao = 1;
         while(opcao!=0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1-Produto"+"\n2-Ar"+"\n3-TV"));
            
        switch (opcao){
            
        case 1: {
            JOptionPane.showMessageDialog(null, produto.Descricao());
            break;}
        case 2: {
            JOptionPane.showMessageDialog(null, ar.Descricao());
            break;}
        case 3: {
            JOptionPane.showMessageDialog(null, tv.Descricao());
            break;}
        
        }
        }
    }

}
