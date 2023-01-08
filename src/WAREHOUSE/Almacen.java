package WAREHOUSE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	private ArrayList<Articulo> articulos = new ArrayList();
	
	public void cargarDatos() throws FileNotFoundException {
		File fichero = new File("datos/almacen.txt");
		Scanner scan = new Scanner(fichero);
		String partes[];
		
		while(scan.hasNextLine()) {
			partes=scan.nextLine().split(":");
			
			if(partes[0].equals("1")) {
				Refresco refresco = new Refresco(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], Boolean.parseBoolean(partes[7]), Boolean.parseBoolean(partes[8]),Integer.parseInt(partes[9]));
				articulos.add(refresco);
		}
			
			if(partes[0].equals("2")) {
				Cerveza cerveza = new Cerveza(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], partes[7], Double.parseDouble(partes[8]));
				articulos.add(cerveza);
		}
			
			if(partes[0].equals("3")) {
				Vino vino = new Vino(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]), Integer.parseInt(partes[5]), partes[6], partes[7], Integer.parseInt(partes[8]), partes[9], Double.parseDouble(partes[10]));
				articulos.add(vino);
			}
		}
	}

	public Articulo elMasCaro() {
		
		return null;
	}
	
	public double precio(String codigoProducto) {
		
		return 0;
	}
	
	public boolean hayStock(String codigoProducto) {
		
		return true;
		
	}
	
	public ArrayList<Articulo> stockJusto(){
		
		return null;
		
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
