
package Controller;
import model.Modelo;
import view.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
/**
 ActionListener= Es lo necesitamos implementar
 para que pueda escuchar,detectar los click(eventos) de algun boton 
 */
public class Controlador implements ActionListener {

    //Nuestros objetos se convierten en clase
    private Vista view;
    private Modelo model;
    
    //creamos el contructor público, mismo nombre de la clase.
    //recibirá 2 parámetros como vista de View y modelo de Model.
    public Controlador(Vista view, Modelo model){
        this.view=view;
        this.model=model;
        // y traemos la acción del boton
        this.view.jButton1.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    //@Override
    public void actionPerformed(ActionEvent e) {
        model.setNum1(Integer.parseInt(view.Txt1.getText()));
        model.setNum2(Integer.parseInt(view.Txt2.getText()));
        model.multiplicar();
        view.TxtResultado.setText(String.valueOf( model.getResultado()));
    }
}
