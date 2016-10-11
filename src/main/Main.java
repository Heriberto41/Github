
package main;
import controllers.*;
import javax.swing.JPanel;
import views.*;
import models.*;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Model_Area  ma = new Model_Area();
        Area area = new Area();
        Controller_Area  ca = new Controller_Area(area,ma);
        
        Model_Perimetro mp= new Model_Perimetro();
        Perimetro perimetro = new Perimetro();
        Controller_Perimetro cp = new Controller_Perimetro(mp, perimetro);
        
        Model_Volumen model_Volumen =  new Model_Volumen();
        Volumen volumen =  new Volumen();
        Controller_Volumen controller_Volumen = new Controller_Volumen(model_Volumen, volumen);
        // actualizacion
        JPanel  views[] = new JPanel [3];
        views [0] = area;
        views [1] = perimetro;
        views [2] = volumen;
        Menu main = new  Menu();
        Controller_Menu controle = new Controller_Menu(main, views);
    }
    
}
