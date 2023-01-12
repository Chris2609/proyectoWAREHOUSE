package WAREHOUSE;
/**
 * a
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Almacen {

	public ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	
	public void cargarDatos() throws FileNotFoundException {
		File fichero = new File("datos/almacen.txt");
		Scanner scan = new Scanner(fichero);
		String partes[];

		while(scan.hasNextLine()) {
			partes=scan.nextLine().split(":");
			
			if(partes[0].equals("1")) {
				Refresco refresco = new Refresco(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], Boolean.parseBoolean(partes[7]), Boolean.parseBoolean(partes[8]),Integer.parseInt(partes[9]));
				articulos.add(refresco);
				refresco.visualizarPropiedades();
		}
			
			if(partes[0].equals("2")) {
				Cerveza cerveza = new Cerveza(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], partes[7], Double.parseDouble(partes[8]));
				articulos.add(cerveza);
				cerveza.visualizarArticulo();
		}
			
			if(partes[0].equals("3")) {
				Vino vino = new Vino(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], partes[7], Integer.parseInt(partes[8]), partes[9], Double.parseDouble(partes[10]));
				articulos.add(vino);
				vino.visualizarArticulo();
			}
		  
		}
		
	
	}

	public Articulo elMasCaro() {
		
		double precio = 0;
		Articulo elMasCaro = null;
		
		for(Articulo articulo:articulos) {
			 if(precio < articulo.getPrecio()) {
				 precio = articulo.getPrecio();
				 elMasCaro = articulo;
			 }
		 }

		return elMasCaro;
	}
	
	public double precio(String codigoProducto) {
		
		return 0;
	}
	
	public boolean hayStock(String codigoProducto) {
		boolean haystock = false;
		for(Articulo articulos: articulos)
			if(articulos.getName().equals(codigoProducto)) {
				if(articulos.getStock() > 0) {
					haystock = true;
				}
			}
		
		return haystock;
		
	}
	
	public ArrayList<Articulo> stockJusto(){
		ArrayList<Articulo> stockjusto = new ArrayList<Articulo>();
		
		for(Articulo articulos: articulos)
		if(articulos.getStock() < 10) {
			stockjusto.add(articulos);
		}
		return stockjusto;
		
	}
	
	public Articulo articulo(String codigoProducto) {
		
		return null;
		
	}
	
	public boolean disponibilidad(int cantidad, String kodigoProducto) {
		
		return false;
		
	}
	
	public ArrayList<Articulo> equivalentes(Articulo articulo){
		return null;
		
	}
	
	public ArrayList<Articulo> ordenarPorPrecio(String orden){
		
		return null;
	} 
	
	public void ordenarPorStock(String orden) {
		
	}
}
