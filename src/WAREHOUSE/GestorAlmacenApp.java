package WAREHOUSE;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
				for(Articulo arti:cargar.articulos) {
					
					int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a disminuir"));
					arti.disminuirStock(opcion_menu);
				}
				
				break;
			case 2:
				String articuloAum = JOptionPane.showInputDialog(null, "Introduce el nombre del articulo a aumentar stock");
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a aumentar"));
				for(Articulo art:cargar.articulos) {
					if(art.getName().equals(articuloAum.toLowerCase())) {
						art.incrementarStock(cantidad);
					}
				}
				PrintWriter writer = new PrintWriter("datos/almacen.txt");
					writer.println(cargar.articulos);
				
				writer.close();
				
				break;
				
			case 3:
			
				JOptionPane.showMessageDialog(null, "El producto más caro es: \n" + cargar.elMasCaro());
				break;
				
			case 4:
				for (int i = 0; i < cargar.stockJusto().size(); i++) {
					JOptionPane.showMessageDialog(null, cargar.stockJusto().get(i));
				}
				break;
			
			case 5:
				String nombrepro = (JOptionPane.showInputDialog(null, "Introduce el nombre del producto"));
				JOptionPane.showMessageDialog(null, cargar.hayStock(nombrepro));
			
				break;
				
			case 6:
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
