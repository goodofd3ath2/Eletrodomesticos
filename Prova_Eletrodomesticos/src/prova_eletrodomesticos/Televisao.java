/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_eletrodomesticos;

/**
 *
 * @author Leticia
 */
public class Televisao extends Produto{
    private String info;
    private Integer qntEntradas;
    private String tipo;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getQntEntradas() {
        return qntEntradas;
    }

    public void setQntEntradas(Integer qntEntradas) {
        this.qntEntradas = qntEntradas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Televisao(){
        this.info = null;
        this.qntEntradas = 0;
        this.tipo = null;
    }
    
   public String Descricao(){
       return super.Descricao()+"Informações"+this.info+"Quantidade de Entradas"+this.qntEntradas+
               "Tipo"+this.tipo;
               
   }
            
}
