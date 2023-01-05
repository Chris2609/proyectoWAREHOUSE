package WAREHOUSE;

public class LineaFactura {

	private int numero;
	private Articulo articulo;
	private int cantidad;
	
	public double precioTotal() {
		return 0;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String formatofich() {
		return  this.numero + ":" + this.articulo.getName() + ":" + this.cantidad;
	}

	@Override
	public String toString() {
		return "LineaFactura [numero=" + numero + ", articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
