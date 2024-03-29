package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post implements Serializable{

	private static final long serialVersionUID = -2462737385258353400L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="postsecuence",sequenceName="DB_SEQUENCIA", allocationSize=1)
	@Column(name="id_post")
	private Long id_post;
	private String img_name;
	private String extension;
	private Date date;
	@ManyToOne
    @JoinColumn(name = "id_usuario") // creamos la columna de tipo objeto con joinColumn
    private Usuario usuario;
	
	@ManyToMany
    @JoinTable(
  		  name = "post_NN_type", 
  		  joinColumns = @JoinColumn(name = "id_post"), 
  		  inverseJoinColumns = @JoinColumn(name = "id_type"))
	
	//@JoinColumn(name = "id_type") // creamos la columna de tipo objeto con joinColumn
	private Set<Tag> typelist;
    
    @ManyToMany
    @JoinTable(
    		  name = "post_NN_tag", 
    		  joinColumns = @JoinColumn(name = "id_post"), 
    		  inverseJoinColumns = @JoinColumn(name = "id_tag"))
    
    //@JoinColumn(name = "tags")
    private Set<Tag> taglist;

	public Post(Long id_post, String img_name, String extension, Date date, Usuario usuario, Set<Tag> typelist,
			Set<Tag> taglist) {
		super();
		this.id_post = id_post;
		this.img_name = img_name;
		this.extension = extension;
		this.date = date;
		this.usuario = usuario;
		this.typelist = typelist;
		this.taglist = taglist;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_post() {
		return id_post;
	}

	public void setId_post(Long id_post) {
		this.id_post = id_post;
	}

	public String getImg_name() {
		return img_name;
	}

	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Tag> getTypelist() {
		return typelist;
	}

	public void setTypelist(Set<Tag> typelist) {
		this.typelist = typelist;
	}

	public Set<Tag> getTaglist() {
		return taglist;
	}

	public void setTaglist(Set<Tag> taglist) {
		this.taglist = taglist;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

}
