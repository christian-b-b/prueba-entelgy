package com.balcorp.restructuracion.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balcorp.restructuracion.models.CommentRestructurado;
import com.balcorp.restructuracion.service.ICommentRestructurado;



@RestController
public class CommentsRestructuradoController {
	@Autowired
	private ICommentRestructurado commentRestructurado;
	
	@PostMapping("/listar")
	public CommentRestructurado findAll(){
		return commentRestructurado.findAll();
	}
}
