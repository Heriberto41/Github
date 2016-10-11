/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.Model_Perimetro;
import views.Perimetro;

/**
 *
 * @author Lenovo
 */
public class Controller_Perimetro implements ActionListener{
   
    Model_Perimetro model_Perimetro;
    Perimetro perimetro;
    public  Controller_Perimetro(Model_Perimetro model_Perimetro,Perimetro perimetro) {
        this.perimetro= perimetro;
        this.model_Perimetro=model_Perimetro;
      
        this.perimetro.setVisible(true);
        this.perimetro.jbtn_Calcular.addActionListener(this);
        this.perimetro.jc_figura.addActionListener(this);
    }
    
    public void  rectangulo (){
      double h = Double.parseDouble(this.perimetro.jt_Altura.getText());
      double b = Double.parseDouble(this.perimetro.jt_Base.getText());
      this.perimetro.jtResultado.setText(""+ (b+b+h+h));
    }
    
    public void  triangulo (){
      double l = Double.parseDouble(this.perimetro.jt_Altura.getText());
      this.perimetro.jtResultado.setText(""+ (l+l+l));
      
    }
    
     public void  romboide (){
      double h = Double.parseDouble(this.perimetro.jt_Altura.getText());
      double b = Double.parseDouble(this.perimetro.jt_Base.getText());
      this.perimetro.jtResultado.setText(""+ (b+b+h+h));
    }
    public void muestra(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(perimetro.jc_figura.getSelectedItem().equals("Rectangulo")){
      if (e.getSource() == perimetro.jc_figura){
          perimetro.jt_Base.setVisible(true);
          perimetro.jl_base.setVisible(true);
          perimetro.jl_Altura.setText("Altura");
         }
     }
       
      else if(perimetro.jc_figura.getSelectedItem().equals("Triangulo")){
       if (e.getSource() == perimetro.jc_figura){
          perimetro.jt_Base.setVisible(false);
          perimetro.jl_base.setVisible(false);
          perimetro.jl_Altura.setText("Lado");
         }
         }
         else if(perimetro.jc_figura.getSelectedItem().equals("Romboide")){
         if (e.getSource() == perimetro.jc_figura){
          perimetro.jt_Base.setVisible(true);
          perimetro.jl_base.setVisible(true);
          perimetro.jl_Altura.setText("Altura");
         }   
         }
     
     if (e.getSource() == perimetro.jbtn_Calcular){
       if(perimetro.jc_figura.getSelectedItem().equals("Rectangulo")){
           rectangulo();
       } 
       else if(perimetro.jc_figura.getSelectedItem().equals("Triangulo")){
           triangulo();
       }
       else if(perimetro.jc_figura.getSelectedItem().equals("Romboide")){
           romboide();
       } 
     }   
    }           
}
