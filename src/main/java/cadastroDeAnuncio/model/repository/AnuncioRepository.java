package cadastroDeAnuncio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cadastroDeAnuncio.model.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {

}
