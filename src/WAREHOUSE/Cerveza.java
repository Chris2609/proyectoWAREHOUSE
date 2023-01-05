package WAREHOUSE;

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
		
	}

	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void precioTotal() {
		// TODO Auto-generated method stub
		
	}

}
