package WAREHOUSE;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;


public class Factura {
	
	private static int IVA = 21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private ArrayList<LineaFactura> lineasfactura = new ArrayList();
	
	public void addLinea() {
		
		
	}
	
	public void eliminarLinea() {

	}
	
	public double precioTotal(){
		double preciototal = 0;
		for(LineaFactura lineas:lineasfactura) {
			preciototal = preciototal + lineas.precioTotal();
		}
		return preciototal;
	}	
	
	public void mostrarEnPantalla() {
		for(LineaFactura lineas:lineasfactura) {
			JOptionPane.showMessageDialog(null, this.numero + ", " + this.nombreEmpresa + ", " + this.fecha + ", " + this.concepto + "\n" + this.lineasfactura);
		}
	}
	
	public void guardarEnFichero() throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter("facturas/" + this.numero + "_" + this.fecha + "_factura.txt");
		writer.print("Factura: " + this.numero + "\nEmpresa: " + this.nombreEmpresa + "\nFecha: " + this.fecha + "\nConcepto: " + this.concepto + "\n");
		for(LineaFactura lineas:lineasfactura) {
			writer.println(lineas.formatofich());
		}
	}
	
	
	public static int getIVA() {
		return IVA;
	}
	public static void setIVA(int iVA) {
		IVA = iVA;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", nombreEmpresa=" + nombreEmpresa + ", fecha=" + fecha + ", concepto="
				+ concepto + ", lineasfactura=" + lineasfactura + "]";
	}
	
	
	
	
}
