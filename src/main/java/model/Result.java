package model;

import java.util.List;


public class Result {
	private List<Categoria> categorias;
	private List<Chiste> chistes;
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<Chiste> getChistes() {
		return chistes;
	}
	public void setChistes(List<Chiste> chistes) {
		this.chistes = chistes;
	}
	@Override
	public String toString() {
		return "Result [categorias=" + categorias + ", chistes=" + chistes + "]";
	}
	

	
}
