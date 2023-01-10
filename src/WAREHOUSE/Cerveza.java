package WAREHOUSE;

import javax.swing.JOptionPane;

public class Cerveza extends Articulo implements Alcoholico {

	private String origen;
	private String/*(2)*/ cereales;
	private  double gradosAlcohol;
	
	public Cerveza(String code, String name, String mark, int capacidadBotella, double precio, int stock, String origen, String cereales, double gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.origen = origen;
		this .cereales = cereales;
		this.gradosAlcohol = gradosAlcohol;
	}
	
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCereales() {
		return cereales;
	}

	public void setCereales(String cereales) {
		this.cereales = cereales;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	@Override
	public void visualizarArticulo() {
		JOptionPane.showMessageDialog(null, super.toString() + "La cerveza es origen " + this.origen + "\nEl tipo de cereales es: " + this.cereales + "\nGrados del alcohol: " + this.gradosAlcohol);

	}

	@Override
	public boolean saludable() {
		return false;
	}

	@Override
	public void precioTotal() {
		double preciototal = 0;
		preciototal = this.getPrecio()*this.getStock();
		JOptionPane.showMessageDialog(null, "El precio de todas las cervezas son " + preciototal + "€");
	}

	@Override
	public boolean esFuerte() {
		boolean muchoAlcohol=false;
		if(this.gradosAlcohol > 7) {
			muchoAlcohol = true;
		}
		return muchoAlcohol;
	}

	@Override
	public double calcularTasa() {
	double calctasa=0;
		
		if(this.esFuerte()==true) {
			calctasa = TASA_BEBIDAS_FUERTES;
		}else if(this.esFuerte()==false) {
			calctasa = TASA_BEBIDAS_SUAVES;
		}
		return calctasa;
	}

}
