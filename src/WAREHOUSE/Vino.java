package WAREHOUSE;

import javax.swing.JOptionPane;

public class Vino extends Articulo implements Alcoholico {

	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTipoDeUva() {
		return tipoDeUva;
	}

	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
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
		JOptionPane.showMessageDialog(null, "El vino es de color " + this.color + "\nOrigen: " + this.origen + "\nAño: " + this.anio + "\nTipo de uva: " + this.tipoDeUva + "\nGrados del alcohol: " + this.gradosAlcohol);

	}

	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		boolean saludable=true;
		if(!this.origen.equals("Navarra")) {
			saludable=false;
		}
		return saludable;
	}

	@Override
	public void precioTotal() {
		// TODO Auto-generated method stub
		double preciototal = 0;
		preciototal = this.getPrecio()*this.getStock();
		JOptionPane.showMessageDialog(null, "El precio de todos los vinos son " + preciototal + "€");
	}

	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		boolean muchoAlcohol=false;
		if(this.gradosAlcohol > 13.5) {
			muchoAlcohol = true;
		}
		return muchoAlcohol;
	}

	@Override
	public double calcularTasa() {
		// TODO Auto-generated method stub
		double calctasa=0;
		
		if(this.esFuerte()==true) {
			calctasa = TASA_BEBIDAS_FUERTES;
		}else if(this.esFuerte()==false) {
			calctasa = TASA_BEBIDAS_SUAVES;
		}
		return calctasa;
	}

}
