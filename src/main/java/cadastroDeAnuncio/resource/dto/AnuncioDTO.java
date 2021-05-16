package cadastroDeAnuncio.resource.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnuncioDTO {
	
	
	private String nome;
	
	
	private String cliente;
	

	
	private String dataDeInicio;
	

	private String dataDeTermino;
	
	
	private String investimento;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getDataDeInicio() {
		return dataDeInicio;
	}


	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}


	public String getDataDeTermino() {
		return dataDeTermino;
	}


	public void setDataDeTermino(String dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}


	public String getInvestimento() {
		return investimento;
	}


	public void setInvestimento(String investimento) {
		this.investimento = investimento;
	}
	

}
