package WAREHOUSE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	private ArrayList<Articulo> articulo = new ArrayList();
	
	public void cargarDatos() throws FileNotFoundException {
		File fichero = new File("datos/fichero.txt");
		Scanner scan = new Scanner(fichero);
		
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
