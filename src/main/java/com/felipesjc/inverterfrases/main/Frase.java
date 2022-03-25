package com.felipesjc.inverterfrases.main;

import java.io.Serializable;

public class Frase implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String frase;
    
	
	public Frase(String frase) {
		super();
		this.frase = frase;
	}
	public Frase() {
		
	}
	
	public String getFrase() {
		return frase;
	}
	
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
	public String inverter() {
		String[] vect = frase.split(" ");
		String fraseConvertida ="";
		for(int i = vect.length - 1; i >= 0; i--) {
			fraseConvertida += vect[i] + " ";
		}
		return fraseConvertida;
	}

}


