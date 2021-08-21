package br.com.alura.forum.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

/*
 *  Foi injetada as dependencias da interface TopicosRepository automaticamente atraves da interface do Spring Data JPA.
 * O metodo .findAll() de JpaRepository retorna uma lista contendo todos os topicos da entidade Topico presente no banco de dados.
 * 
 * */

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicosRepository topicosRepository;
	
	@Autowired
	private CursoRepository cursosRepository;
	
	@GetMapping
	public List<TopicoDto> lista(){
		
		List<Topico> topicos = topicosRepository.findAll();
	
		return TopicoDto.converter(topicos);
		
	
	}
	
	@PostMapping
	public void cadastrar(@RequestBody TopicoForm form){
		
		Topico topico = form.converter(cursosRepository);
		topicosRepository.save(topico);
	}
	
	
	
	
	

}
