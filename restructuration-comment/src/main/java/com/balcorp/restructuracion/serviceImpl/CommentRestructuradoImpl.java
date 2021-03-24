package com.balcorp.restructuracion.serviceImpl;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.balcorp.restructuracion.models.Comment;
import com.balcorp.restructuracion.models.CommentRestructurado;
import com.balcorp.restructuracion.service.ICommentRestructurado;



@Service
public class CommentRestructuradoImpl implements ICommentRestructurado {
	@Autowired
	private RestTemplate clienteRest;
	
	
	@Value("${servicio.comments-base.url}")
	private String url;
	
	public List<Comment> buscar(){
		return Arrays.asList(clienteRest.getForObject(url, Comment[].class));
	}
	
	@Override
	public CommentRestructurado findAll() {		
		return new CommentRestructurado(buscar());
	}
	
	

}
