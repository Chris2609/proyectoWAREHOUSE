package WAREHOUSE;
import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.swing.*;

public class GestorAlmacenApp {

	public void run() throws FileNotFoundException {
		Almacen cargar = new Almacen();
		cargar.cargarDatos();
		
		int opcion_menu;
		do {
			opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"------MENU-------\n" + "1. Realizar venta\n" + "2. Realizar compra\n"
							+  "3. Ver el artículo más caro\n" + "4. Ver los articulos con stock menor que 10\n" + "5. Saber si hay stock de un producto\n" + "6. Ver articulos saludables\n" + "0. Salir\n"));
			switch (opcion_menu) {
			case 1:
				JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
									
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
				break;
			case 4:
			
				JOptionPane.showMessageDialog(null, "El producto más caro es: \n" + cargar.elMasCaro());
				break;
				
			case 5:
				for (int i = 0; i < cargar.stockJusto().size(); i++) {
					JOptionPane.showMessageDialog(null, cargar.stockJusto().get(i));
				}
				break;
			
			case 6:
				String nombrepro = (JOptionPane.showInputDialog(null, "Introduce el nombre del producto"));
				JOptionPane.showMessageDialog(null, cargar.hayStock(nombrepro));
			
				break;
				
			case 7:
				Refresco refres = new Refresco();
				
				for(Articulo arti : cargar.articulos) {
					if(arti.saludable()==true) {
						JOptionPane.showMessageDialog(null, arti);
					}
				}
				
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != 0);
		
	}
	
}
