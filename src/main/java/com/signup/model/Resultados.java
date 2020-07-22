package com.signup.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tabla_resultados")
public class Resultados {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int anio;
	private int qna;
	private char nombre;
	private float UR_416_PER;
	private float UR_416_DED;
	private float UR_X00_PER;
	private float UR_X00_DED;
	private float UR_610_PER;
	private float UR_610_DED;
	
	public Resultados() {
		
	
	}

	public Resultados(int anio, int qna, char id, char nombre, float uR_416_PER, float uR_416_DED, float uR_X00_PER,
			float uR_X00_DED, float uR_610_PER, float uR_610_DED) {
		super();
		this.anio = anio;
		this.qna = qna;
		this.id = id;
		this.nombre = nombre;
		UR_416_PER = uR_416_PER;
		UR_416_DED = uR_416_DED;
		UR_X00_PER = uR_X00_PER;
		UR_X00_DED = uR_X00_DED;
		UR_610_PER = uR_610_PER;
		UR_610_DED = uR_610_DED;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getQna() {
		return qna;
	}

	public void setQna(int qna) {
		this.qna = qna;
	}

	public int getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public char getNombre() {
		return nombre;
	}

	public void setNombre(char nombre) {
		this.nombre = nombre;
	}

	public float getUR_416_PER() {
		return UR_416_PER;
	}

	public void setUR_416_PER(float uR_416_PER) {
		UR_416_PER = uR_416_PER;
	}

	public float getUR_416_DED() {
		return UR_416_DED;
	}

	public void setUR_416_DED(float uR_416_DED) {
		UR_416_DED = uR_416_DED;
	}

	public float getUR_X00_PER() {
		return UR_X00_PER;
	}

	public void setUR_X00_PER(float uR_X00_PER) {
		UR_X00_PER = uR_X00_PER;
	}

	public float getUR_X00_DED() {
		return UR_X00_DED;
	}

	public void setUR_X00_DED(float uR_X00_DED) {
		UR_X00_DED = uR_X00_DED;
	}

	public float getUR_610_PER() {
		return UR_610_PER;
	}

	public void setUR_610_PER(float uR_610_PER) {
		UR_610_PER = uR_610_PER;
	}

	public float getUR_610_DED() {
		return UR_610_DED;
	}

	public void setUR_610_DED(float uR_610_DED) {
		UR_610_DED = uR_610_DED;
	}
	
	
	
}
