package com.educacionIT.digitalers.Entidades;

public class Pista extends Coleccion {
	Integer id;
	Integer duracion;
	String artista;
	String album;
	Integer anio;
	Integer genero;
	
	//Constructors
	public Pista() {
	}
	public Pista(String nombre, Integer id, Integer duracion, String artista, String album, Integer anio, Integer genero) {
		super(nombre);
		this.id = id;
		this.duracion = duracion;
		this.artista = artista;
		this.album = album;
		this.anio = anio;
		this.genero = genero;
	}
	
	
	//Getters & setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getGenero() {
		return genero;
	}
	public void setGenero(Integer genero) {
		this.genero = genero;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	//Methods
	@Override
	public String toString() {
		return "Pista " + super.toString() + ", id=" + id + ", duracion=" + duracion + ", artista="
				+ artista + ", album=" + album + ", anio=" + anio + ", genero=" + genero;
	}
	@Override
	public Integer getCantElementos() {
		return 1;
	}
	
	
	
	
}
