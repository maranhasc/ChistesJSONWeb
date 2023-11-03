package model;

public class Chiste {
	private String id;
	private String idcategoria;
	private String contenido;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Chiste [id=" + id + ", idcategoria=" + idcategoria + ", contenido=" + contenido + "]";
	}
	

}
