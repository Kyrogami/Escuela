package com.escuela.modelo;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "usuarios")
@EntityListeners(AuditingEntityListener.class)
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre") //Dudo si esto lo necesito
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private Long telefono;
	
	@Column(name = "tipo_usuario")
	private Long tipo_usuario;
	
	@Column(name = "activo")
	private boolean activo;

	public Alumno(Long id, String nombre, String apellidos, String dni, String usuario, String password,String foto,String direccion, Long telefono,Long tipo_usuario, boolean activo ) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.usuario=usuario;

		this.password=password;
		this.foto=foto;
		this.direccion=direccion;
		this.telefono=telefono;
		this.tipo_usuario=tipo_usuario;
		this.activo=activo;
		
			
	}
	
	public Alumno() {
		
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", usuario=" + usuario + ", password=" + password + ", foto=" + foto + ", direccion=" + direccion + ", telefono="+ telefono + ", tipo_usuario=" + tipo_usuario + ", activo=" + activo + "]";
	}

	
	//generamos getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Long getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(Long tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}	
}
