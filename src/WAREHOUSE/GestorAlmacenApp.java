package WAREHOUSE;
import java.io.FileNotFoundException;

import javax.swing.*;

public class GestorAlmacenApp {

	public void run() throws FileNotFoundException {
		
		int opcion_menu;
		do {
			opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"------MENU-------\n" + "1. Realizar venta\n" + "2. segunda opcion\n"
							+ "3. tercera opcion\n" + "4. Salir\n"));
			switch (opcion_menu) {
			case 1:
				JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
				Almacen cargar = new Almacen();
				cargar.cargarDatos();
				
				
				
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != 4);
		
	}
	
}
