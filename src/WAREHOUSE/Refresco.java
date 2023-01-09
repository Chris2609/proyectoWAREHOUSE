package WAREHOUSE;

import javax.swing.JOptionPane;

public class Refresco extends Articulo{

	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	
	
	public Refresco(String code, String name, String mark, int capacidadBotella, double precio, int stock, String sabor, boolean zumo, boolean gaseoso, int cantidadAzucar) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
	}
	
	public void visualizarPropiedades() {
		JOptionPane.showMessageDialog(null, "El refresco es de " + this.sabor + "\nEs un zumo?: " + this.zumo + "\nEs gaseoso?: " + this.gaseoso + "\nSu cantidad de azúcar es: " + this.cantidadAzucar + "gr");
	}

	public boolean esSaludable() {
		boolean saludable = true;
		if(cantidadAzucar > 20) {
			saludable = false;
		}
		return saludable;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isZumo() {
		return zumo;
	}
	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}
	public boolean isGaseoso() {
		return gaseoso;
	}
	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}
	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	@Override
	public void visualizarArticulo() {
		JOptionPane.showMessageDialog(null, "El refresco es de " + this.sabor + "\nEs un zumo?: " + this.zumo + "\nEs gaseoso?: " + this.gaseoso + "\nSu cantidad de azúcar es: " + this.cantidadAzucar + "gr");

	}

	@Override
	public boolean saludable() {
		boolean saludable = true;
		if(this.cantidadAzucar > 20) {
			saludable = false;
		}
		return saludable;
	}

	@Override
	public void precioTotal() {
	
		double preciototal = 0;
		preciototal = this.getPrecio()*this.getStock();
		JOptionPane.showMessageDialog(null, "El precio de todos los refrescos son " + preciototal + "€");
		
	}
	
	
	
}
