package com.dojo.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="dojos")

public class Dojo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String location;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
    
    @PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
    public Dojo() { 	
        
    }
	public Dojo(Long id, String name, String location, Date createdAt, Date updatedAt, List<Ninja> ninjas) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.ninjas = ninjas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Ninja> getNinjas() {
		return ninjas;
	}
	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
    
    
	
}
