package com.stackcoders.flyway.model;

import javax.persistence.*;

import javax.validation.constraints.Size;

/**
 * Created by Balaji Sundarajan on 20/01/2019.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @Column(unique = true)
    @Size(min = 1, max = 100)
    private String username;

    
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;
    
    @Size(max = 50)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
