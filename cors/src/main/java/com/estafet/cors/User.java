/**
 * 
 */
package com.estafet.cors;

import javax.validation.constraints.NotNull;

/**
 * @author estafetuser
 *
 */
public class User {

	 	@NotNull
	    private long id;
	    @NotNull
	    private String name;

	    public User() {
	    }

	    public User(long id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
}
