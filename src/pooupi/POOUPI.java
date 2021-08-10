

package pooupi;
import javax.swing.JOptionPane;

public class POOUPI {
//atributos
    String color;
    String marca;
    String modelo;
    int odometro;
    
    public static void main(String[] args) {
        
            POOUPI carro1 = new POOUPI();
               carro1.color = "Gris";
               carro1.marca = "Audi";
               carro1.modelo = "A3";
               carro1.odometro = 100;     

               System.out.print("El color es: " + carro1.color);
               System.out.print("La marca es: " + carro1.marca);
               System.out.print("El modelo es: " + carro1.modelo);
               System.out.print("El odometro es: " + carro1.odometro);
            
               System.out.print("----------------------");
               POOUPI taxi = new POOUPI();
               taxi.color = JOptionPane.showInputDialog("Digite el color del taxi");
               taxi.marca = JOptionPane.showInputDialog("Digite la marca del taxi");
               taxi.modelo = JOptionPane.showInputDialog("Digite el color del modelo");
               taxi.odometro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el odometro del taxi:"));
               
               JOptionPane.showMessageDialog(null, "El color del taxi es: " +taxi.color);
               JOptionPane.showMessageDialog(null, "La marca del taxi es: " +taxi.marca);
               JOptionPane.showMessageDialog(null, "El modelo del taxi es: " +taxi.modelo);
               JOptionPane.showMessageDialog(null, "El odometro del taxi es: " +taxi.odometro);

               POOUPI bus = new POOUPI();
               bus.color = JOptionPane.showInputDialog("Digite el color del bus");
               bus.marca = JOptionPane.showInputDialog("Digite la marca del bus");
               bus.modelo = JOptionPane.showInputDialog("Digite el modelo del bus");
               bus.odometro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el odometro del bus:"));
               
               JOptionPane.showMessageDialog(null, "El color del bus es: " +bus.color);
               JOptionPane.showMessageDialog(null, "La marca del bus es: " +bus.marca);
               JOptionPane.showMessageDialog(null, "El modelo del bus es: " +bus.modelo);
               JOptionPane.showMessageDialog(null, "El odometro del bus es: " +bus.odometro);
    }

}
