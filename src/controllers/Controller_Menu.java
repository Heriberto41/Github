
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.Menu;
/**
 *
 * @author Lenovo
 */
public class Controller_Menu implements ActionListener{
Menu menu;
JPanel views [];
 
 public Controller_Menu(Menu menu, JPanel []  views) {
     this.menu = menu;
     this.views = views;
     this.menu.jmArea.addActionListener(this);
     this.menu.jmPerimetro.addActionListener(this);
     this.menu.jmVolumen.addActionListener(this);
     init_view();
 }
 
 
 
 public void jmi_areaActionPerformed(){
        this.menu.setContentPane(views [0]);
        this.menu.revalidate();
        this.menu.repaint();
 }
 
public void jmi_perimetroActionPerformed(){
        this.menu.setContentPane(views [1]);
        this.menu.revalidate();
        this.menu.repaint();
 }

public void jmi_volumenActionPerformed(){
        this.menu.setContentPane(views [2]);
        this.menu.revalidate();
        this.menu.repaint();
 }
 
 public void  init_view (){
   menu.setLocationRelativeTo(null);
   menu.setTitle("Operaciones");
   this.menu.setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == menu.jmArea)
            jmi_areaActionPerformed();
    else if(e.getSource() == menu.jmPerimetro)
     jmi_perimetroActionPerformed();
    else if(e.getSource() == menu.jmVolumen)
       jmi_volumenActionPerformed();
    }
    
}
