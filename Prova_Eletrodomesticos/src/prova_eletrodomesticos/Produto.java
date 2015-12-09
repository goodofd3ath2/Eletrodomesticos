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
public class Produto {
    private String marca;
    private Double preço;
    private String disponibilidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public Produto(){
        this.marca = null;
        this.preço = 0.0;
        this.disponibilidade = null;
    }
    public Boolean Disponivel(){
        int disponibilidade = JOptionPane.showConfirmDialog(null,
                                 "Está disponivel?", "Selecione",
                                 JOptionPane.YES_NO_OPTION);
        if(disponibilidade == 1){
            return false;
        }
        else if(disponibilidade == 0){
            return true;
        }
        return null;         
    }
    public String Descricao(){
        return "Marca"+this.marca+"Preço"+this.preço+"Disponivel"+this.getDisponibilidade();
    }
            
}
