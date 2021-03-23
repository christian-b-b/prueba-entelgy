package com.balcorp.restructuracion.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommentRestructurado implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7212291348740042183L;
	
	List<String> data=new ArrayList<>();

	
	
	public CommentRestructurado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CommentRestructurado(List<Comment> comments) {
		
				
		for (Comment comment : comments) {
			this.data.add(comment.getPostId()+"\\"+comment.getId()+"\\"+comment.getEmail());
			
		}
		
	}



	public List<String> getData() {
		return data;
	}



	public void setData(List<String> data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "CommentRestructurado [data=" + data + "]";
	}

	
	
	
	
	
	
}
