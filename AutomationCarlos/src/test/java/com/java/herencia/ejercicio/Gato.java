package com.java.herencia.ejercicio;

public class Gato {
	
	private String color;
	private String tipoCOla;
	
	private int patas;
	
	public Gato (String color, String tipoCola, int patas)
	{
		this.color= color;
		this.tipoCOla = tipoCola;
		this.patas = patas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoCOla() {
		return tipoCOla;
	}

	public void setTipoCOla(String tipoCOla) {
		this.tipoCOla = tipoCOla;
	}

	public void temperamento ()
	{
		System.out.println("Jugueton");
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if ( patas > 10) {
			patas = -1;
		}else {
			this.patas = patas;
		}
		
	}

}
