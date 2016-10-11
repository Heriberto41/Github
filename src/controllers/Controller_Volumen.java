/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Volumen;
import models.Model_Volumen;
/**
 *
 * @author Lenovo
 */
public class Controller_Volumen implements ActionListener{
  Volumen volumen;
  Model_Volumen model_Volumen;

public Controller_Volumen(Model_Volumen model_Volumen, Volumen volumen) {
      this.model_Volumen = model_Volumen;
      this.volumen = volumen;
      this.volumen.setVisible(true);
      this.volumen.jbtn_Calcular.addActionListener(this);
      this.volumen.jc_Figura.addActionListener(this);
    }
  
  public void rectangulo(){
    double bmay = Double.parseDouble(volumen.jtx_Basemayor.getText());
    double bmen = Double.parseDouble(volumen.jtx_Basemenor.getText());
    double altura = Double.parseDouble(volumen.jtx_Altura.getText());
    volumen.jtx_Resultado.setText(""+ (bmay*bmen*altura));
  }
  
  public void cuadrado(){
      double lado = Double.parseDouble(volumen.jtx_Basemayor.getText());
      volumen.jtx_Resultado.setText(""+ lado*lado*lado);
  }
  
  public void triangulo (){
    double areabas = Double.parseDouble(volumen.jtx_Basemayor.getText());
    double altura = Double.parseDouble(volumen.jtx_Altura.getText());
    volumen.jtx_Resultado.setText("" +(areabas*altura)/3);
  }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(volumen.jc_Figura.getSelectedItem().equals("Triangulo")){
           if (e.getSource() ==  volumen.jc_Figura){
               this.volumen.jtx_Basemenor.setVisible(false);
               this.volumen.jl_Basemenor.setVisible(false);
               this.volumen.jl_Basemayor.setText("Area de la base");
           }
       }
       if(volumen.jc_Figura.getSelectedItem().equals("Cuadrado")){
        if (e.getSource() ==  volumen.jc_Figura){
            this.volumen.jtx_Basemenor.setVisible(false);
            this.volumen.jl_Basemenor.setVisible(false);
            this.volumen.jtx_Altura.setVisible(false);
            this.volumen.jl_Altura.setVisible(false);
            this.volumen.jl_Basemayor.setText("Lado");
        }   
       }
       if(volumen.jc_Figura.getSelectedItem().equals("Rectangulo")){
        if (e.getSource() ==  volumen.jc_Figura){
            this.volumen.jtx_Basemenor.setVisible(true);
            this.volumen.jl_Basemenor.setVisible(true);
            this.volumen.jtx_Altura.setVisible(true);
            this.volumen.jl_Altura.setVisible(true);
            this.volumen.jl_Basemayor.setText("Base mayor");
        }   
       }
       if (e.getSource()== volumen.jbtn_Calcular){   
       if(volumen.jc_Figura.getSelectedItem().equals("Rectangulo")){
               rectangulo();
         }
       else if(volumen.jc_Figura.getSelectedItem().equals("Triangulo")){
               triangulo();
         }
       else if(volumen.jc_Figura.getSelectedItem().equals("Cuadrado")){
               cuadrado();
         }
       } 
    }
   
}
