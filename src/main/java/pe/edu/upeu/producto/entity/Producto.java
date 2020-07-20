package pe.edu.upeu.producto.entity;

public class Producto {
	private int idproducto;
	private String nomproc;
	private Double precio;
	private int cantidad;
	public Producto() {
		
		
	}
	public Producto(int idproducto, String nomproc, Double precio, int cantidad) {
		super();
		this.idproducto = idproducto;
		this.nomproc = nomproc;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomproc() {
		return nomproc;
	}
	public void setNomproc(String nomproc) {
		this.nomproc = nomproc;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
