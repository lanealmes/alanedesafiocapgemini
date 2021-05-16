package cadastroDeAnuncio.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "anuncio")
public class Anuncio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome",nullable = false,length = 220)
	private String nome;
	
	@Column(name = "cliente",nullable = false,length = 220)
	private String cliente;
	
	@Column(name = "data_de_inicio",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataDeInicio;
	
	@Column(name = "data_de_termino",nullable = false)
	private LocalDate dataDeTermino;
	
	@Column(name = "investimento",nullable = false)
	private BigDecimal investimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public LocalDate getDataDeTermino() {
		return dataDeTermino;
	}

	public void setDataDeTermino(LocalDate dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}

	public BigDecimal getInvestimento() {
		return investimento;
	}

	public void setInvestimento(BigDecimal investimento) {
		this.investimento = investimento;
	}
	
	
	
	}
	
