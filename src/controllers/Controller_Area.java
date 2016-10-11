
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Area;
import views.Area;

/**
 *
 * @author Lenovo
 */
public class Controller_Area implements ActionListener {
 Model_Area model_Area;
 Area area;
    public Controller_Area(Area area, Model_Area ma) {
        this.area=area;
        this.model_Area=ma;
        this.area.jt_Altura.setText(""+ model_Area.getAltura());
        this.area.jt_Base.setText(""+model_Area.getBase());
        this.area.setVisible(true);
        this.area.jbtn_Calcular.addActionListener(this);
    }
    
    public void  rectangulo (){
      double h = Double.parseDouble(this.area.jt_Altura.getText());
      double b = Double.parseDouble(this.area.jt_Base.getText());
      this.area.jtResultado.setText(""+ b*h);
    }
    
    public void  triangulo (){
      double h = Double.parseDouble(this.area.jt_Altura.getText());
      double b = Double.parseDouble(this.area.jt_Base.getText());
      this.area.jtResultado.setText(""+ (b*h)/2);
    }
    
     public void  romboide (){
      double h = Double.parseDouble(this.area.jt_Altura.getText());
      double b = Double.parseDouble(this.area.jt_Base.getText());
      this.area.jtResultado.setText(""+ b*h);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() ==  this.area.jbtn_Calcular){
         
         if(area.jc_figura.getSelectedItem().equals("Rectangulo")){
             rectangulo();
         }
         else if(area.jc_figura.getSelectedItem().equals("Triangulo")){
             triangulo();
         }
         else if(area.jc_figura.getSelectedItem().equals("Romboide")){
             romboide();
         }
         
         } 
    }
}
