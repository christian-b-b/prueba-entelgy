package com.balcorp.restructuracion.models;

import java.io.Serializable;

public class Comment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -201966059678333052L;
	private Long postId;
	private Long id;
	private String name;
	private String email;
	private String body;
	
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(Long postId, Long id, String name, String email, String body) {
		super();
		this.postId = postId;
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Comment [postId=" + postId + ", id=" + id + ", name=" + name + ", email=" + email + ", body=" + body
				+ "]";
	}
	
	
	
	
	
	
	
}
