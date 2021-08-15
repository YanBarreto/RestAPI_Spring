package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicosRepository topicosRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		
		List<Topico> topicos = topicosRepository.findAll();
	
		return TopicoDto.converter(topicos);
		
		/* Foi injetada as dependencias da interface TopicosRepository automaticamente atraves da interface do Spring Data JPA.*/
		/*O metodo .findAll() de JpaRepository retorna uma lista contendo todos os topicos da entidade Topico presente no banco de dados.*/
	}
	
	

}
