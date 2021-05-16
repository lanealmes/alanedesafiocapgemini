package cadastroDeAnuncio.resource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cadastroDeAnuncio.model.Anuncio;
import cadastroDeAnuncio.model.repository.AnuncioRepository;
import cadastroDeAnuncio.resource.dto.AnuncioDTO;
import cadastroDeAnuncio.utils.BigDecimalConverter;

@RestController
@RequestMapping("/anuncio")
public class AnuncioResource {
	
	@Autowired
	private BigDecimalConverter bigDecimalConverter;
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	@GetMapping
    public List<Anuncio> buscarAnuncios(){
        return anuncioRepository.findAll();
    }
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Anuncio salvarAnuncio(@RequestBody @Valid AnuncioDTO anuncioDTO) {
		
		LocalDate dataInicio = LocalDate.parse(anuncioDTO.getDataDeInicio(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataTermino = LocalDate.parse(anuncioDTO.getDataDeTermino(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Anuncio anuncio = new Anuncio();
		
		anuncio.setNome(anuncioDTO.getNome());
		anuncio.setCliente(anuncioDTO.getCliente());
		anuncio.setDataDeInicio(dataInicio);
		anuncio.setDataDeTermino(dataTermino);
		anuncio.setInvestimento(bigDecimalConverter.converter(anuncioDTO.getInvestimento()));
		
		return anuncioRepository.save(anuncio);
		
	}

}
