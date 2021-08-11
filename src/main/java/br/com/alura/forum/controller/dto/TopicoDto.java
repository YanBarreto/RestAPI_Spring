package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}

	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public static List<TopicoDto> converter(List<Topico> topicos) {
		
		/*
		 * Recebo uma lista de topicos e crio um mapa a partir deste utilizando a api stream do Java 8. 
		 * Em seguida utilizo a api collect para transformar este mapa em uma lista e retorno  a mesma na funcao.
		 * 
		 * Mapa funciona com < Key , Value > 
		 * 
		 * Logo estamos instanciando um objeto do tipo TopicoDto para cada cada topico passado.
		 * */
			
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	
	
	
	

}
