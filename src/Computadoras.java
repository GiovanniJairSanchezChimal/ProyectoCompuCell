
public class Computadoras {
	
	private String marca;
	private String so;
	private float precio;
	private boolean estatus;
	
	public Computadoras(String marca, String so, float precio, boolean estatus) {
		this.marca = marca;
		this.so = so;
		this.precio = precio;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", so=" + so + ", precio=" + precio + ", estatus=" + estatus + "a\n"+"]";
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	

}
