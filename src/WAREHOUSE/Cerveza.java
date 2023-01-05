package WAREHOUSE;

import javax.swing.JOptionPane;

public class Cerveza extends Articulo {

	private String origen;
	private String/*(2)*/ cereales;
	private  double gradosAlcohol;
	
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
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La cerveza es origen " + this.origen + "\nEl tipo de cereales es: " + this.cereales + "\nGrados del alcohol: " + this.gradosAlcohol);

	}

	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void precioTotal() {
		// TODO Auto-generated method stub
		double preciototal = 0;
		preciototal = this.getPrecio()*this.getStock();
		JOptionPane.showMessageDialog(null, "El precio de todas las cervezas son " + preciototal + "€");
	}

}
