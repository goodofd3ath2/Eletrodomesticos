/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova_eletrodomesticos;
import javax.swing.JOptionPane;
        
public class ArCondicionado extends Produto{
    private Integer qntBTU;
    private Boolean painel;
    private Boolean disponibilidade;

   
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public Integer getQntBTU() {
        return qntBTU;
    }

    public void setQntBTU(Integer qntBTU) {
        this.qntBTU = qntBTU;
    }

    public Boolean getPainel() {
        return painel;
    }

    public void setPainel(Boolean painel) {
        this.painel = painel;
    }
    
    public ArCondicionado(){
        this.painel = null;
        this.qntBTU = 0;
        this.disponibilidade= null;
    }
    
    public Boolean TemPainel(){
        int painel = JOptionPane.showConfirmDialog(null,
                                 "Tem painel eletronico?", "Selecione",
                                 JOptionPane.YES_NO_OPTION);
        if(painel == 1){
            return false;
        }
        else if(painel == 0){
            return true;
        }
        return null;
        
    }
        public String Descricao(){
         return super.Descricao()+"painel"+this.TemPainel()+"Quantidade BTU"+this.qntBTU;
     }
             
             
       
            
}
